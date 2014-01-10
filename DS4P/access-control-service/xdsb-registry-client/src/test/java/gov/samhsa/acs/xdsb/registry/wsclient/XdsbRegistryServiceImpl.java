package gov.samhsa.acs.xdsb.registry.wsclient;

import gov.samhsa.schema.ds4p.xdsbregistry.message.RegistryRequest;
import ihe.iti.xds_b._2007.XDSRegistry;

import java.util.logging.Logger;
import javax.jws.WebService;

import org.hl7.v3.MCCIIN000002UV01;
import org.hl7.v3.PRPAIN201301UV02;
import org.hl7.v3.PRPAIN201302UV02;
import org.hl7.v3.PRPAIN201304UV02;

import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryResponse;

/**
 * This class was generated by Apache CXF 2.6.0 2012-11-21T08:25:58.844-05:00
 * Generated source version: 2.6.0
 * 
 */

@WebService(serviceName = "DocumentRegistryService", portName = "XDSRegistry_HTTP_Endpoint", targetNamespace = "http://samhsa.gov/ds4p/XDSbRegistry/", wsdlLocation = "classpath:XDS.b_registry.net.wsdl", endpointInterface = "ihe.iti.xds_b._2007.XDSRegistry")
public class XdsbRegistryServiceImpl implements XDSRegistry {

	private static final Logger LOG = Logger.getLogger(XdsbRegistryServiceImpl.class
			.getName());
	
	protected static AdhocQueryResponse returnedValueOfRegistryStoredQuery;
	protected static MCCIIN000002UV01 returnedValueOfPatientRegistryRecordRevised;
	protected static MCCIIN000002UV01 returnedValueOfPatientRegistryRecordAdded;
	protected static MCCIIN000002UV01 returnedValueOfPatientRegistryDuplicatesResolved;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ihe.iti.xds_b._2007.XDSRegistry#patientRegistryRecordRevised(com.microsoft
	 * .schemas.message.RegistryRequest input )*
	 */
	@Override
	public MCCIIN000002UV01 patientRegistryRecordRevised(
			PRPAIN201302UV02 input) {
		LOG.info("Executing operation patientRegistryRecordRevised");
		System.out.println(input);
		try {
			MCCIIN000002UV01 _return = returnedValueOfPatientRegistryRecordRevised;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ihe.iti.xds_b._2007.XDSRegistry#updateDocumentSet(com.microsoft.schemas
	 * .message.RegistryRequest input )*
	 */
	@Override
	public Object updateDocumentSet(
			RegistryRequest input) {
		LOG.info("Executing operation updateDocumentSet");
		System.out.println(input);
		try {
			RegistryRequest _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ihe.iti.xds_b._2007.XDSRegistry#registryStoredQuery(oasis.names.tc.
	 * ebxml_regrep.xsd.query._3.AdhocQueryRequest input )*
	 */
	@Override
	public AdhocQueryResponse registryStoredQuery(
			oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryRequest input) {
		LOG.info("Executing operation registryStoredQuery");
		System.out.println(input);
		try {
			AdhocQueryResponse _return = returnedValueOfRegistryStoredQuery;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ihe.iti.xds_b._2007.XDSRegistry#deleteDocumentSet(com.microsoft.schemas
	 * .message.RegistryRequest input )*
	 */
	@Override
	public Object deleteDocumentSet(
			RegistryRequest input) {
		LOG.info("Executing operation deleteDocumentSet");
		System.out.println(input);
		try {
			RegistryRequest _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ihe.iti.xds_b._2007.XDSRegistry#patientRegistryRecordAdded(com.microsoft
	 * .schemas.message.RegistryRequest input )*
	 */
	@Override
	public MCCIIN000002UV01 patientRegistryRecordAdded(
			PRPAIN201301UV02 input) {
		LOG.info("Executing operation patientRegistryRecordAdded");
		System.out.println(input);
		try {
			MCCIIN000002UV01 _return = returnedValueOfPatientRegistryRecordAdded;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ihe.iti.xds_b._2007.XDSRegistry#patientRegistryDuplicatesResolved(com
	 * .microsoft.schemas.message.RegistryRequest input )*
	 */
	@Override
	public MCCIIN000002UV01 patientRegistryDuplicatesResolved(
			PRPAIN201304UV02 input) {
		LOG.info("Executing operation patientRegistryDuplicatesResolved");
		System.out.println(input);
		try {
			MCCIIN000002UV01 _return = returnedValueOfPatientRegistryDuplicatesResolved;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ihe.iti.xds_b._2007.XDSRegistry#registerDocumentSet(com.microsoft.schemas
	 * .message.RegistryRequest input )*
	 */
	@Override
	public Object registerDocumentSet(
			RegistryRequest input) {
		LOG.info("Executing operation registerDocumentSet");
		System.out.println(input);
		try {
			RegistryRequest _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}