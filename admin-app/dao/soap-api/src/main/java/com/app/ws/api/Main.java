package com.app.ws.api;

import ua.itea.app.dao.Dao;
import ua.itea.app.dao.DaoImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        DaoAPI daoAPI = new DaoAPI();
        Dao dao = new DaoImpl();
        daoAPI.setDao(new DaoImpl());

        Endpoint.publish("http://127.0.0.1:8084/api", daoAPI);
    }
}
