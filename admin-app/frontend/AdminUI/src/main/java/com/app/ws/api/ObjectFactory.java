
package com.app.ws.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.app.ws.api package. 
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

    private final static QName _ReadAllQuestionsResponse_QNAME = new QName("http://api.ws.app.com/", "readAllQuestionsResponse");
    private final static QName _RoleOfUser_QNAME = new QName("http://api.ws.app.com/", "roleOfUser");
    private final static QName _UpdateQuestion_QNAME = new QName("http://api.ws.app.com/", "updateQuestion");
    private final static QName _AuthenticationResponse_QNAME = new QName("http://api.ws.app.com/", "authenticationResponse");
    private final static QName _SetDao_QNAME = new QName("http://api.ws.app.com/", "setDao");
    private final static QName _SetDaoResponse_QNAME = new QName("http://api.ws.app.com/", "setDaoResponse");
    private final static QName _ReadAllUsersResponse_QNAME = new QName("http://api.ws.app.com/", "readAllUsersResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://api.ws.app.com/", "addUserResponse");
    private final static QName _ReadAllUsers_QNAME = new QName("http://api.ws.app.com/", "readAllUsers");
    private final static QName _Authentication_QNAME = new QName("http://api.ws.app.com/", "authentication");
    private final static QName _RoleOfUserResponse_QNAME = new QName("http://api.ws.app.com/", "roleOfUserResponse");
    private final static QName _DeleteUserByLogin_QNAME = new QName("http://api.ws.app.com/", "deleteUserByLogin");
    private final static QName _ReadAllQuestions_QNAME = new QName("http://api.ws.app.com/", "readAllQuestions");
    private final static QName _AddQuestionResponse_QNAME = new QName("http://api.ws.app.com/", "addQuestionResponse");
    private final static QName _AddUser_QNAME = new QName("http://api.ws.app.com/", "addUser");
    private final static QName _UpdateUsersByUsernameResponse_QNAME = new QName("http://api.ws.app.com/", "updateUsersByUsernameResponse");
    private final static QName _AddQuestion_QNAME = new QName("http://api.ws.app.com/", "addQuestion");
    private final static QName _UpdateQuestionResponse_QNAME = new QName("http://api.ws.app.com/", "updateQuestionResponse");
    private final static QName _DeleteUserByLoginResponse_QNAME = new QName("http://api.ws.app.com/", "deleteUserByLoginResponse");
    private final static QName _UpdateUsersByUsername_QNAME = new QName("http://api.ws.app.com/", "updateUsersByUsername");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.app.ws.api
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
     * Create an instance of {@link DeleteUserByLogin }
     * 
     */
    public DeleteUserByLogin createDeleteUserByLogin() {
        return new DeleteUserByLogin();
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
     * Create an instance of {@link UpdateUsersByUsernameResponse }
     * 
     */
    public UpdateUsersByUsernameResponse createUpdateUsersByUsernameResponse() {
        return new UpdateUsersByUsernameResponse();
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
     * Create an instance of {@link DeleteUserByLoginResponse }
     * 
     */
    public DeleteUserByLoginResponse createDeleteUserByLoginResponse() {
        return new DeleteUserByLoginResponse();
    }

    /**
     * Create an instance of {@link UpdateUsersByUsername }
     * 
     */
    public UpdateUsersByUsername createUpdateUsersByUsername() {
        return new UpdateUsersByUsername();
    }

    /**
     * Create an instance of {@link UpdateQuestion }
     * 
     */
    public UpdateQuestion createUpdateQuestion() {
        return new UpdateQuestion();
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
     * Create an instance of {@link SetDao }
     * 
     */
    public SetDao createSetDao() {
        return new SetDao();
    }

    /**
     * Create an instance of {@link SetDaoResponse }
     * 
     */
    public SetDaoResponse createSetDaoResponse() {
        return new SetDaoResponse();
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
     * Create an instance of {@link DaoImpl }
     * 
     */
    public DaoImpl createDaoImpl() {
        return new DaoImpl();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllQuestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "readAllQuestionsResponse")
    public JAXBElement<ReadAllQuestionsResponse> createReadAllQuestionsResponse(ReadAllQuestionsResponse value) {
        return new JAXBElement<ReadAllQuestionsResponse>(_ReadAllQuestionsResponse_QNAME, ReadAllQuestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "roleOfUser")
    public JAXBElement<RoleOfUser> createRoleOfUser(RoleOfUser value) {
        return new JAXBElement<RoleOfUser>(_RoleOfUser_QNAME, RoleOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "updateQuestion")
    public JAXBElement<UpdateQuestion> createUpdateQuestion(UpdateQuestion value) {
        return new JAXBElement<UpdateQuestion>(_UpdateQuestion_QNAME, UpdateQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "authenticationResponse")
    public JAXBElement<AuthenticationResponse> createAuthenticationResponse(AuthenticationResponse value) {
        return new JAXBElement<AuthenticationResponse>(_AuthenticationResponse_QNAME, AuthenticationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "setDao")
    public JAXBElement<SetDao> createSetDao(SetDao value) {
        return new JAXBElement<SetDao>(_SetDao_QNAME, SetDao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "setDaoResponse")
    public JAXBElement<SetDaoResponse> createSetDaoResponse(SetDaoResponse value) {
        return new JAXBElement<SetDaoResponse>(_SetDaoResponse_QNAME, SetDaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "readAllUsersResponse")
    public JAXBElement<ReadAllUsersResponse> createReadAllUsersResponse(ReadAllUsersResponse value) {
        return new JAXBElement<ReadAllUsersResponse>(_ReadAllUsersResponse_QNAME, ReadAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "readAllUsers")
    public JAXBElement<ReadAllUsers> createReadAllUsers(ReadAllUsers value) {
        return new JAXBElement<ReadAllUsers>(_ReadAllUsers_QNAME, ReadAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleOfUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "roleOfUserResponse")
    public JAXBElement<RoleOfUserResponse> createRoleOfUserResponse(RoleOfUserResponse value) {
        return new JAXBElement<RoleOfUserResponse>(_RoleOfUserResponse_QNAME, RoleOfUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserByLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "deleteUserByLogin")
    public JAXBElement<DeleteUserByLogin> createDeleteUserByLogin(DeleteUserByLogin value) {
        return new JAXBElement<DeleteUserByLogin>(_DeleteUserByLogin_QNAME, DeleteUserByLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllQuestions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "readAllQuestions")
    public JAXBElement<ReadAllQuestions> createReadAllQuestions(ReadAllQuestions value) {
        return new JAXBElement<ReadAllQuestions>(_ReadAllQuestions_QNAME, ReadAllQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "addQuestionResponse")
    public JAXBElement<AddQuestionResponse> createAddQuestionResponse(AddQuestionResponse value) {
        return new JAXBElement<AddQuestionResponse>(_AddQuestionResponse_QNAME, AddQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsersByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "updateUsersByUsernameResponse")
    public JAXBElement<UpdateUsersByUsernameResponse> createUpdateUsersByUsernameResponse(UpdateUsersByUsernameResponse value) {
        return new JAXBElement<UpdateUsersByUsernameResponse>(_UpdateUsersByUsernameResponse_QNAME, UpdateUsersByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "addQuestion")
    public JAXBElement<AddQuestion> createAddQuestion(AddQuestion value) {
        return new JAXBElement<AddQuestion>(_AddQuestion_QNAME, AddQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "updateQuestionResponse")
    public JAXBElement<UpdateQuestionResponse> createUpdateQuestionResponse(UpdateQuestionResponse value) {
        return new JAXBElement<UpdateQuestionResponse>(_UpdateQuestionResponse_QNAME, UpdateQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserByLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "deleteUserByLoginResponse")
    public JAXBElement<DeleteUserByLoginResponse> createDeleteUserByLoginResponse(DeleteUserByLoginResponse value) {
        return new JAXBElement<DeleteUserByLoginResponse>(_DeleteUserByLoginResponse_QNAME, DeleteUserByLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsersByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws.app.com/", name = "updateUsersByUsername")
    public JAXBElement<UpdateUsersByUsername> createUpdateUsersByUsername(UpdateUsersByUsername value) {
        return new JAXBElement<UpdateUsersByUsername>(_UpdateUsersByUsername_QNAME, UpdateUsersByUsername.class, null, value);
    }

}
