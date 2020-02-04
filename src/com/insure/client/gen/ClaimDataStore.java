
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

    /**
     * 
     * @param arg0
     * @return
     *     returns com.insure.client.gen.Claim
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClaimFromID", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetClaimFromID")
    @ResponseWrapper(localName = "getClaimFromIDResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetClaimFromIDResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getClaimFromIDRequest", output = "http://server.insure.com/ClaimDataStore/getClaimFromIDResponse")
    public Claim getClaimFromID(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createAddDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateAddDocument")
    @ResponseWrapper(localName = "createAddDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateAddDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/createAddDocumentRequest", output = "http://server.insure.com/ClaimDataStore/createAddDocumentResponse")
    public int createAddDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws ClaimIDNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveDocuments", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveDocuments")
    @ResponseWrapper(localName = "retrieveDocumentsResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveDocumentsResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/retrieveDocumentsRequest", output = "http://server.insure.com/ClaimDataStore/retrieveDocumentsResponse", fault = {
        @FaultAction(className = ClaimIDNotFoundException_Exception.class, value = "http://server.insure.com/ClaimDataStore/retrieveDocuments/Fault/claimIDNotFoundException")
    })
    public String retrieveDocuments(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws ClaimIDNotFoundException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.PrintClaim")
    @ResponseWrapper(localName = "printClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.PrintClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/printClaimRequest", output = "http://server.insure.com/ClaimDataStore/printClaimResponse")
    public String printClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "size", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.Size")
    @ResponseWrapper(localName = "sizeResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.SizeResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/sizeRequest", output = "http://server.insure.com/ClaimDataStore/sizeResponse")
    public int size();

}
