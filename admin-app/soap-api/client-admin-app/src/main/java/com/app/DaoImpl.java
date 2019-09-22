
package com.app;

import ua.itea.app.model.Question;
import ua.itea.app.model.Users;

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
@WebService(name = "DaoImpl", targetNamespace = "http://dao.app.itea.ua/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DaoImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "roleOfUser", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.RoleOfUser")
    @ResponseWrapper(localName = "roleOfUserResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.RoleOfUserResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/roleOfUserRequest", output = "http://dao.app.itea.ua/DaoImpl/roleOfUserResponse")
    public String roleOfUser(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.AddUserResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/addUserRequest", output = "http://dao.app.itea.ua/DaoImpl/addUserResponse")
    public void addUser(
            @WebParam(name = "arg0", targetNamespace = "")
                    Users arg0);

    /**
     * 
     * @return
     *     returns java.util.List<ua.itea.app.dao.Users>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAllUsers", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.ReadAllUsers")
    @ResponseWrapper(localName = "readAllUsersResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.ReadAllUsersResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/readAllUsersRequest", output = "http://dao.app.itea.ua/DaoImpl/readAllUsersResponse")
    public List<Users> readAllUsers();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUsersById", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.UpdateUsersById")
    @ResponseWrapper(localName = "updateUsersByIdResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.UpdateUsersByIdResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/updateUsersByIdRequest", output = "http://dao.app.itea.ua/DaoImpl/updateUsersByIdResponse")
    public void updateUsersById(
            @WebParam(name = "arg0", targetNamespace = "")
                    Users arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authentication", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.Authentication")
    @ResponseWrapper(localName = "authenticationResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.AuthenticationResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/authenticationRequest", output = "http://dao.app.itea.ua/DaoImpl/authenticationResponse")
    public boolean authentication(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<ua.itea.app.dao.Question>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAllQuestions", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.ReadAllQuestions")
    @ResponseWrapper(localName = "readAllQuestionsResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.ReadAllQuestionsResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/readAllQuestionsRequest", output = "http://dao.app.itea.ua/DaoImpl/readAllQuestionsResponse")
    public List<Question> readAllQuestions();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateQuestion", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.UpdateQuestion")
    @ResponseWrapper(localName = "updateQuestionResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.UpdateQuestionResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/updateQuestionRequest", output = "http://dao.app.itea.ua/DaoImpl/updateQuestionResponse")
    public void updateQuestion(
            @WebParam(name = "arg0", targetNamespace = "")
                    Question arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addQuestion", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.AddQuestion")
    @ResponseWrapper(localName = "addQuestionResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.AddQuestionResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/addQuestionRequest", output = "http://dao.app.itea.ua/DaoImpl/addQuestionResponse")
    public void addQuestion(
            @WebParam(name = "arg0", targetNamespace = "")
                    Question arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteById", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.DeleteById")
    @ResponseWrapper(localName = "deleteByIdResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.DeleteByIdResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/deleteByIdRequest", output = "http://dao.app.itea.ua/DaoImpl/deleteByIdResponse")
    public void deleteById(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteQuestionById", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.DeleteQuestionById")
    @ResponseWrapper(localName = "deleteQuestionByIdResponse", targetNamespace = "http://dao.app.itea.ua/", className = "ua.itea.app.dao.DeleteQuestionByIdResponse")
    @Action(input = "http://dao.app.itea.ua/DaoImpl/deleteQuestionByIdRequest", output = "http://dao.app.itea.ua/DaoImpl/deleteQuestionByIdResponse")
    public void deleteQuestionById(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0);

}
