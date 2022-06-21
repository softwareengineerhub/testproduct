
package com.app.ws.api;

import java.util.List;
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
@WebService(name = "DaoAPI", targetNamespace = "http://api.ws.app.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DaoAPI {


    /**
     * 
     * @return
     *     returns java.util.List<com.app.ws.api.Question>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAllQuestions", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.ReadAllQuestions")
    @ResponseWrapper(localName = "readAllQuestionsResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.ReadAllQuestionsResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/readAllQuestionsRequest", output = "http://api.ws.app.com/DaoAPI/readAllQuestionsResponse")
    public List<Question> readAllQuestions();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateQuestion", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.UpdateQuestion")
    @ResponseWrapper(localName = "updateQuestionResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.UpdateQuestionResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/updateQuestionRequest", output = "http://api.ws.app.com/DaoAPI/updateQuestionResponse")
    public void updateQuestion(
        @WebParam(name = "arg0", targetNamespace = "")
        Question arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.AddUserResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/addUserRequest", output = "http://api.ws.app.com/DaoAPI/addUserResponse")
    public void addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Users arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.app.ws.api.Users>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAllUsers", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.ReadAllUsers")
    @ResponseWrapper(localName = "readAllUsersResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.ReadAllUsersResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/readAllUsersRequest", output = "http://api.ws.app.com/DaoAPI/readAllUsersResponse")
    public List<Users> readAllUsers();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authentication", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.Authentication")
    @ResponseWrapper(localName = "authenticationResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.AuthenticationResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/authenticationRequest", output = "http://api.ws.app.com/DaoAPI/authenticationResponse")
    public boolean authentication(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "roleOfUser", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.RoleOfUser")
    @ResponseWrapper(localName = "roleOfUserResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.RoleOfUserResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/roleOfUserRequest", output = "http://api.ws.app.com/DaoAPI/roleOfUserResponse")
    public String roleOfUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addQuestion", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.AddQuestion")
    @ResponseWrapper(localName = "addQuestionResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.AddQuestionResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/addQuestionRequest", output = "http://api.ws.app.com/DaoAPI/addQuestionResponse")
    public void addQuestion(
        @WebParam(name = "arg0", targetNamespace = "")
        Question arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setDao", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.SetDao")
    @ResponseWrapper(localName = "setDaoResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.SetDaoResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/setDaoRequest", output = "http://api.ws.app.com/DaoAPI/setDaoResponse")
    public void setDao(
        @WebParam(name = "arg0", targetNamespace = "")
        DaoImpl arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUsersByUsername", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.UpdateUsersByUsername")
    @ResponseWrapper(localName = "updateUsersByUsernameResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.UpdateUsersByUsernameResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/updateUsersByUsernameRequest", output = "http://api.ws.app.com/DaoAPI/updateUsersByUsernameResponse")
    public void updateUsersByUsername(
        @WebParam(name = "arg0", targetNamespace = "")
        Users arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUserByLogin", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.DeleteUserByLogin")
    @ResponseWrapper(localName = "deleteUserByLoginResponse", targetNamespace = "http://api.ws.app.com/", className = "com.app.ws.api.DeleteUserByLoginResponse")
    @Action(input = "http://api.ws.app.com/DaoAPI/deleteUserByLoginRequest", output = "http://api.ws.app.com/DaoAPI/deleteUserByLoginResponse")
    public void deleteUserByLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}