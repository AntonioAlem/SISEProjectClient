
package com.insure.client.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClaimDataStore", targetNamespace = "http://server.insure.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClaimDataStore {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.insure.client.gen.Claim
     * @throws IDNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveClaim")
    @ResponseWrapper(localName = "retrieveClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/retrieveClaimRequest", output = "http://server.insure.com/ClaimDataStore/retrieveClaimResponse", fault = {
        @FaultAction(className = IDNotFoundException_Exception.class, value = "http://server.insure.com/ClaimDataStore/retrieveClaim/Fault/IDNotFoundException")
    })
    public Claim retrieveClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws IDNotFoundException_Exception
    ;

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "clearDataStore", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClearDataStore")
    @ResponseWrapper(localName = "clearDataStoreResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClearDataStoreResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/clearDataStoreRequest", output = "http://server.insure.com/ClaimDataStore/clearDataStoreResponse")
    public void clearDataStore();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaim")
    @ResponseWrapper(localName = "createClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/createClaimRequest", output = "http://server.insure.com/ClaimDataStore/createClaimResponse")
    public int createClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
