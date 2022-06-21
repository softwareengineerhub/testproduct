
package com.app.ws.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DaoAPIService", targetNamespace = "http://api.ws.app.com/", wsdlLocation = "http://127.0.0.1:8084/api?wsdl")
public class DaoAPIService
    extends Service
{

    private final static URL DAOAPISERVICE_WSDL_LOCATION;
    private final static WebServiceException DAOAPISERVICE_EXCEPTION;
    private final static QName DAOAPISERVICE_QNAME = new QName("http://api.ws.app.com/", "DaoAPIService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8084/api?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DAOAPISERVICE_WSDL_LOCATION = url;
        DAOAPISERVICE_EXCEPTION = e;
    }

    public DaoAPIService() {
        super(__getWsdlLocation(), DAOAPISERVICE_QNAME);
    }

    public DaoAPIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DAOAPISERVICE_QNAME, features);
    }

    public DaoAPIService(URL wsdlLocation) {
        super(wsdlLocation, DAOAPISERVICE_QNAME);
    }

    public DaoAPIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DAOAPISERVICE_QNAME, features);
    }

    public DaoAPIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DaoAPIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DaoAPI
     */
    @WebEndpoint(name = "DaoAPIPort")
    public DaoAPI getDaoAPIPort() {
        return super.getPort(new QName("http://api.ws.app.com/", "DaoAPIPort"), DaoAPI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DaoAPI
     */
    @WebEndpoint(name = "DaoAPIPort")
    public DaoAPI getDaoAPIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.ws.app.com/", "DaoAPIPort"), DaoAPI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DAOAPISERVICE_EXCEPTION!= null) {
            throw DAOAPISERVICE_EXCEPTION;
        }
        return DAOAPISERVICE_WSDL_LOCATION;
    }

}