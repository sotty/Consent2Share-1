// LoginFailureEventListener.java
package gov.samhsa.consent2share.infrastructure.eventlistener;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import gov.samhsa.consent2share.domain.account.Users;
import gov.samhsa.consent2share.domain.account.UsersRepository;
import gov.samhsa.consent2share.infrastructure.securityevent.AuthenticationFailedEvent;

@Component("loginFailureEventListener")
public class LoginFailureEventListener extends EventListener {
	@Autowired
	UsersRepository usersRepository;

	@Value("${maximum_failed_attempts}")
	private short max_failed_attempts;

	@SuppressWarnings("unused")
	private LoginFailureEventListener() {
	}

	public LoginFailureEventListener(short max_failed_attempts) {
		this.max_failed_attempts = max_failed_attempts;
	}

	@Override
	public boolean canHandle(Object event) {
		return event instanceof AuthenticationFailureBadCredentialsEvent;
	}

	@Override
	public void handle(Object event) {
		AuthenticationFailureBadCredentialsEvent loginFailureEvent = (AuthenticationFailureBadCredentialsEvent) event;
		Object name = loginFailureEvent.getAuthentication().getPrincipal();
		Users user = usersRepository.loadUserByUsername((String) name);
		eventService.raiseSecurityEvent(new AuthenticationFailedEvent(
				((WebAuthenticationDetails) loginFailureEvent
						.getAuthentication().getDetails()).getRemoteAddress(),(String) name));
		if (user != null) {
			// update the failed login count
			user.increaseFailedLoginAttempts();
			if (user.getFailedLoginAttempts() >= max_failed_attempts) {
				Calendar cal = Calendar.getInstance();
				user.setLockoutTime(cal);
			}
			// update user
			usersRepository.updateUser(user);
		}
	}
}
