
package com.mycompany.moviessoap;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MoviesWebServiceService", targetNamespace = "http://moviessoap.mycompany.com/", wsdlLocation = "http://localhost:8080/MoviesSoap/MoviesWebServiceService?wsdl")
public class MoviesWebServiceService
    extends Service
{

    private final static URL MOVIESWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESWEBSERVICESERVICE_EXCEPTION;
    private final static QName MOVIESWEBSERVICESERVICE_QNAME = new QName("http://moviessoap.mycompany.com/", "MoviesWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MoviesSoap/MoviesWebServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESWEBSERVICESERVICE_WSDL_LOCATION = url;
        MOVIESWEBSERVICESERVICE_EXCEPTION = e;
    }

    public MoviesWebServiceService() {
        super(__getWsdlLocation(), MOVIESWEBSERVICESERVICE_QNAME);
    }

    public MoviesWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESWEBSERVICESERVICE_QNAME, features);
    }

    public MoviesWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MOVIESWEBSERVICESERVICE_QNAME);
    }

    public MoviesWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESWEBSERVICESERVICE_QNAME, features);
    }

    public MoviesWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MoviesWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MoviesWebService
     */
    @WebEndpoint(name = "MoviesWebServicePort")
    public MoviesWebService getMoviesWebServicePort() {
        return super.getPort(new QName("http://moviessoap.mycompany.com/", "MoviesWebServicePort"), MoviesWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MoviesWebService
     */
    @WebEndpoint(name = "MoviesWebServicePort")
    public MoviesWebService getMoviesWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://moviessoap.mycompany.com/", "MoviesWebServicePort"), MoviesWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MOVIESWEBSERVICESERVICE_EXCEPTION;
        }
        return MOVIESWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
