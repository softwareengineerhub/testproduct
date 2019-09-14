
package com.app;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.itea.app.dao package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteByIdResponse_QNAME = new QName("http://dao.app.itea.ua/", "deleteByIdResponse");
    private final static QName _ReadAllQuestionsResponse_QNAME = new QName("http://dao.app.itea.ua/", "readAllQuestionsResponse");
    private final static QName _RoleOfUser_QNAME = new QName("http://dao.app.itea.ua/", "roleOfUser");
    private final static QName _UpdateQuestion_QNAME = new QName("http://dao.app.itea.ua/", "updateQuestion");
    private final static QName _UpdateUsersByIdResponse_QNAME = new QName("http://dao.app.itea.ua/", "updateUsersByIdResponse");
    private final static QName _AuthenticationResponse_QNAME = new QName("http://dao.app.itea.ua/", "authenticationResponse");
    private final static QName _ReadAllUsersResponse_QNAME = new QName("http://dao.app.itea.ua/", "readAllUsersResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://dao.app.itea.ua/", "addUserResponse");
    private final static QName _ReadAllUsers_QNAME = new QName("http://dao.app.itea.ua/", "readAllUsers");
    private final static QName _Authentication_QNAME = new QName("http://dao.app.itea.ua/", "authentication");
    private final static QName _DeleteById_QNAME = new QName("http://dao.app.itea.ua/", "deleteById");
    private final static QName _DeleteQuestionByIdResponse_QNAME = new QName("http://dao.app.itea.ua/", "deleteQuestionByIdResponse");
    private final static QName _ReadAllQuestions_QNAME = new QName("http://dao.app.itea.ua/", "readAllQuestions");
    private final static QName _AddQuestionResponse_QNAME = new QName("http://dao.app.itea.ua/", "addQuestionResponse");
    private final static QName _AddUser_QNAME = new QName("http://dao.app.itea.ua/", "addUser");
    private final static QName _RoleOfUserResponse_QNAME = new QName("http://dao.app.itea.ua/", "roleOfUserResponse");
    private final static QName _DeleteQuestionById_QNAME = new QName("http://dao.app.itea.ua/", "deleteQuestionById");
    private final static QName _AddQuestion_QNAME = new QName("http://dao.app.itea.ua/", "addQuestion");
    private final static QName _UpdateQuestionResponse_QNAME = new QName("http://dao.app.itea.ua/", "updateQuestionResponse");
    private final static QName _UpdateUsersById_QNAME = new QName("http://dao.app.itea.ua/", "updateUsersById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.itea.app.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoleOfUserResponse }
     * 
     */
    public RoleOfUserResponse createRoleOfUserResponse() {
        return new RoleOfUserResponse();
    }

    /**
     * Create an instance of {@link ReadAllQuestions }
     * 
     */
    public ReadAllQuestions createReadAllQuestions() {
        return new ReadAllQuestions();
    }

    /**
     * Create an instance of {@link AddQuestionResponse }
     * 
     */
    public AddQuestionResponse createAddQuestionResponse() {
        return new AddQuestionResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddQuestion }
     * 
     */
    public AddQuestion createAddQuestion() {
        return new AddQuestion();
    }

    /**
     * Create an instance of {@link UpdateQuestionResponse }
     * 
     */
    public UpdateQuestionResponse createUpdateQuestionResponse() {
        return new UpdateQuestionResponse();
    }

    /**
     * Create an instance of {@link UpdateUsersById }
     * 
     */
    public UpdateUsersById createUpdateUsersById() {
        return new UpdateUsersById();
    }

    /**
     * Create an instance of {@link DeleteQuestionById }
     * 
     */
    public DeleteQuestionById createDeleteQuestionById() {
        return new DeleteQuestionById();
    }

    /**
     * Create an instance of {@link UpdateQuestion }
     * 
     */
    public UpdateQuestion createUpdateQuestion() {
        return new UpdateQuestion();
    }

    /**
     * Create an instance of {@link UpdateUsersByIdResponse }
     * 
     */
    public UpdateUsersByIdResponse createUpdateUsersByIdResponse() {
        return new UpdateUsersByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteByIdResponse }
     * 
     */
    public DeleteByIdResponse createDeleteByIdResponse() {
        return new DeleteByIdResponse();
    }

    /**
     * Create an instance of {@link ReadAllQuestionsResponse }
     * 
     */
    public ReadAllQuestionsResponse createReadAllQuestionsResponse() {
        return new ReadAllQuestionsResponse();
    }

    /**
     * Create an instance of {@link RoleOfUser }
     * 
     */
    public RoleOfUser createRoleOfUser() {
        return new RoleOfUser();
    }

    /**
     * Create an instance of {@link AuthenticationResponse }
     * 
     */
    public AuthenticationResponse createAuthenticationResponse() {
        return new AuthenticationResponse();
    }

    /**
     * Create an instance of {@link DeleteById }
     * 
     */
    public DeleteById createDeleteById() {
        return new DeleteById();
    }

    /**
     * Create an instance of {@link DeleteQuestionByIdResponse }
     * 
     */
    public DeleteQuestionByIdResponse createDeleteQuestionByIdResponse() {
        return new DeleteQuestionByIdResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link ReadAllUsers }
     * 
     */
    public ReadAllUsers createReadAllUsers() {
        return new ReadAllUsers();
    }

    /**
     * Create an instance of {@link ReadAllUsersResponse }
     * 
     */
    public ReadAllUsersResponse createReadAllUsersResponse() {
        return new ReadAllUsersResponse();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "deleteByIdResponse")
    public JAXBElement<DeleteByIdResponse> createDeleteByIdResponse(DeleteByIdResponse value) {
        return new JAXBElement<DeleteByIdResponse>(_DeleteByIdResponse_QNAME, DeleteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllQuestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "readAllQuestionsResponse")
    public JAXBElement<ReadAllQuestionsResponse> createReadAllQuestionsResponse(ReadAllQuestionsResponse value) {
        return new JAXBElement<ReadAllQuestionsResponse>(_ReadAllQuestionsResponse_QNAME, ReadAllQuestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "roleOfUser")
    public JAXBElement<RoleOfUser> createRoleOfUser(RoleOfUser value) {
        return new JAXBElement<RoleOfUser>(_RoleOfUser_QNAME, RoleOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "updateQuestion")
    public JAXBElement<UpdateQuestion> createUpdateQuestion(UpdateQuestion value) {
        return new JAXBElement<UpdateQuestion>(_UpdateQuestion_QNAME, UpdateQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsersByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "updateUsersByIdResponse")
    public JAXBElement<UpdateUsersByIdResponse> createUpdateUsersByIdResponse(UpdateUsersByIdResponse value) {
        return new JAXBElement<UpdateUsersByIdResponse>(_UpdateUsersByIdResponse_QNAME, UpdateUsersByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "authenticationResponse")
    public JAXBElement<AuthenticationResponse> createAuthenticationResponse(AuthenticationResponse value) {
        return new JAXBElement<AuthenticationResponse>(_AuthenticationResponse_QNAME, AuthenticationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "readAllUsersResponse")
    public JAXBElement<ReadAllUsersResponse> createReadAllUsersResponse(ReadAllUsersResponse value) {
        return new JAXBElement<ReadAllUsersResponse>(_ReadAllUsersResponse_QNAME, ReadAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "readAllUsers")
    public JAXBElement<ReadAllUsers> createReadAllUsers(ReadAllUsers value) {
        return new JAXBElement<ReadAllUsers>(_ReadAllUsers_QNAME, ReadAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "deleteById")
    public JAXBElement<DeleteById> createDeleteById(DeleteById value) {
        return new JAXBElement<DeleteById>(_DeleteById_QNAME, DeleteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteQuestionByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "deleteQuestionByIdResponse")
    public JAXBElement<DeleteQuestionByIdResponse> createDeleteQuestionByIdResponse(DeleteQuestionByIdResponse value) {
        return new JAXBElement<DeleteQuestionByIdResponse>(_DeleteQuestionByIdResponse_QNAME, DeleteQuestionByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllQuestions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "readAllQuestions")
    public JAXBElement<ReadAllQuestions> createReadAllQuestions(ReadAllQuestions value) {
        return new JAXBElement<ReadAllQuestions>(_ReadAllQuestions_QNAME, ReadAllQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "addQuestionResponse")
    public JAXBElement<AddQuestionResponse> createAddQuestionResponse(AddQuestionResponse value) {
        return new JAXBElement<AddQuestionResponse>(_AddQuestionResponse_QNAME, AddQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleOfUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "roleOfUserResponse")
    public JAXBElement<RoleOfUserResponse> createRoleOfUserResponse(RoleOfUserResponse value) {
        return new JAXBElement<RoleOfUserResponse>(_RoleOfUserResponse_QNAME, RoleOfUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteQuestionById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "deleteQuestionById")
    public JAXBElement<DeleteQuestionById> createDeleteQuestionById(DeleteQuestionById value) {
        return new JAXBElement<DeleteQuestionById>(_DeleteQuestionById_QNAME, DeleteQuestionById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "addQuestion")
    public JAXBElement<AddQuestion> createAddQuestion(AddQuestion value) {
        return new JAXBElement<AddQuestion>(_AddQuestion_QNAME, AddQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "updateQuestionResponse")
    public JAXBElement<UpdateQuestionResponse> createUpdateQuestionResponse(UpdateQuestionResponse value) {
        return new JAXBElement<UpdateQuestionResponse>(_UpdateQuestionResponse_QNAME, UpdateQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsersById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.app.itea.ua/", name = "updateUsersById")
    public JAXBElement<UpdateUsersById> createUpdateUsersById(UpdateUsersById value) {
        return new JAXBElement<UpdateUsersById>(_UpdateUsersById_QNAME, UpdateUsersById.class, null, value);
    }

}
