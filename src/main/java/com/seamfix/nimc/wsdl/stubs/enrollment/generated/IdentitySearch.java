
package com.seamfix.nimc.wsdl.stubs.enrollment.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IdentitySearch", targetNamespace = "http://IdentitySearch.nimc/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IdentitySearch {


    /**
     * 
     * @param level
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.DemoMapPermission
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPermissionByLevel", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.GetPermissionByLevel")
    @ResponseWrapper(localName = "getPermissionByLevelResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.GetPermissionByLevelResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/getPermissionByLevelRequest", output = "http://IdentitySearch.nimc/IdentitySearch/getPermissionByLevelResponse")
    public DemoMapPermission getPermissionByLevel(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "level", targetNamespace = "")
        int level);

    /**
     * 
     * @param password
     * @param orgid
     * @param username
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.TokenObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createToken", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.CreateToken")
    @ResponseWrapper(localName = "createTokenResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.CreateTokenResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/createTokenRequest", output = "http://IdentitySearch.nimc/IdentitySearch/createTokenResponse")
    public TokenObject createToken(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "orgid", targetNamespace = "")
        String orgid);

    /**
     * 
     * @param password
     * @param orgid
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createTokenString", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.CreateTokenString")
    @ResponseWrapper(localName = "createTokenStringResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.CreateTokenStringResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/createTokenStringRequest", output = "http://IdentitySearch.nimc/IdentitySearch/createTokenStringResponse")
    public String createTokenString(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "orgid", targetNamespace = "")
        String orgid);

    /**
     * 
     * @param demoDataMandatory
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByDemo", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByDemo")
    @ResponseWrapper(localName = "searchByDemoResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByDemoResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/searchByDemoRequest", output = "http://IdentitySearch.nimc/IdentitySearch/searchByDemoResponse")
    public SearchResponseDemo searchByDemo(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "DemoDataMandatory", targetNamespace = "")
        DemoDataMandatory demoDataMandatory);

    /**
     * 
     * @param newpassword
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.TokenObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "changePassword", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.ChangePassword")
    @ResponseWrapper(localName = "changePasswordResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.ChangePasswordResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/changePasswordRequest", output = "http://IdentitySearch.nimc/IdentitySearch/changePasswordResponse")
    public TokenObject changePassword(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "newpassword", targetNamespace = "")
        String newpassword);

    /**
     * 
     * @param demoDataMandatory
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByDemoPhone", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByDemoPhone")
    @ResponseWrapper(localName = "searchByDemoPhoneResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByDemoPhoneResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/searchByDemoPhoneRequest", output = "http://IdentitySearch.nimc/IdentitySearch/searchByDemoPhoneResponse")
    public SearchResponseDemo searchByDemoPhone(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "DemoDataMandatory", targetNamespace = "")
        String demoDataMandatory);

    /**
     * 
     * @param nin
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByNIN", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByNIN")
    @ResponseWrapper(localName = "searchByNINResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByNINResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/searchByNINRequest", output = "http://IdentitySearch.nimc/IdentitySearch/searchByNINResponse")
    public SearchResponseDemo searchByNIN(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nin", targetNamespace = "")
        String nin);

    /**
     * 
     * @param doc
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByDocumentNumber", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByDocumentNumber")
    @ResponseWrapper(localName = "searchByDocumentNumberResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByDocumentNumberResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/searchByDocumentNumberRequest", output = "http://IdentitySearch.nimc/IdentitySearch/searchByDocumentNumberResponse")
    public SearchResponseDemo searchByDocumentNumber(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "doc", targetNamespace = "")
        String doc);

    /**
     * 
     * @param nin
     * @param firstname
     * @param phone
     * @param surname
     * @param email
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.LoginMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUserSELF", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.UpdateUserSELF")
    @ResponseWrapper(localName = "updateUserSELFResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.UpdateUserSELFResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/updateUserSELFRequest", output = "http://IdentitySearch.nimc/IdentitySearch/updateUserSELFResponse")
    public LoginMessage updateUserSELF(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nin", targetNamespace = "")
        String nin,
        @WebParam(name = "surname", targetNamespace = "")
        String surname,
        @WebParam(name = "firstname", targetNamespace = "")
        String firstname,
        @WebParam(name = "phone", targetNamespace = "")
        String phone,
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param data
     * @param fingerPositionCode
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByFinger", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByFinger")
    @ResponseWrapper(localName = "searchByFingerResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByFingerResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/searchByFingerRequest", output = "http://IdentitySearch.nimc/IdentitySearch/searchByFingerResponse")
    public SearchResponseDemo searchByFinger(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "data", targetNamespace = "")
        String data,
        @WebParam(name = "FingerPositionCode", targetNamespace = "")
        int fingerPositionCode);

    /**
     * 
     * @param data
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByPhoto", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByPhoto")
    @ResponseWrapper(localName = "searchByPhotoResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchByPhotoResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/searchByPhotoRequest", output = "http://IdentitySearch.nimc/IdentitySearch/searchByPhotoResponse")
    public SearchResponseDemo searchByPhoto(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "data", targetNamespace = "")
        String data);

    /**
     * 
     * @param fingerStringInBase64
     * @param nin
     * @param pos
     * @param token
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifyFingerWithData", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.VerifyFingerWithData")
    @ResponseWrapper(localName = "verifyFingerWithDataResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.VerifyFingerWithDataResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/verifyFingerWithDataRequest", output = "http://IdentitySearch.nimc/IdentitySearch/verifyFingerWithDataResponse")
    public SearchResponseDemo verifyFingerWithData(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nin", targetNamespace = "")
        String nin,
        @WebParam(name = "fingerStringInBase64", targetNamespace = "")
        String fingerStringInBase64,
        @WebParam(name = "pos", targetNamespace = "")
        int pos);

    /**
     * 
     * @param nin
     * @param pos
     * @param token
     * @param photoStringInBase64
     * @return
     *     returns com.seamfix.nimc.wsdl.stubs.enrollment.generated.SearchResponseDemo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifyPhotoWithData", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.VerifyPhotoWithData")
    @ResponseWrapper(localName = "verifyPhotoWithDataResponse", targetNamespace = "http://IdentitySearch.nimc/", className = "com.seamfix.nimc.wsdl.stubs.enrollment.generated.VerifyPhotoWithDataResponse")
    @Action(input = "http://IdentitySearch.nimc/IdentitySearch/verifyPhotoWithDataRequest", output = "http://IdentitySearch.nimc/IdentitySearch/verifyPhotoWithDataResponse")
    public SearchResponseDemo verifyPhotoWithData(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nin", targetNamespace = "")
        String nin,
        @WebParam(name = "photoStringInBase64", targetNamespace = "")
        String photoStringInBase64,
        @WebParam(name = "pos", targetNamespace = "")
        int pos);

}
