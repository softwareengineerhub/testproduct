package org.soap.client;

import com.app.ws.api.DaoAPI;
import com.app.ws.api.DaoAPIService;
import com.app.ws.api.Users;

import java.util.List;

public class SoapService {
    private DaoAPI daoAPI;

    public SoapService() {
        DaoAPIService daoAPIService = new DaoAPIService();
        this.daoAPI = daoAPIService.getDaoAPIPort();
    }

    public void addUser(Users users){
        System.out.println("addUser()");
        daoAPI.addUser(users);
    }

    public List<Users> readAllUsers(){
        return daoAPI.readAllUsers();
    }

    public void updateUsersByUsername(Users users){
        daoAPI.updateUsersByUsername(users);
    }

    public void remove(Users users){
        daoAPI.deleteUserByLogin(users.getLogin());
    }


}
