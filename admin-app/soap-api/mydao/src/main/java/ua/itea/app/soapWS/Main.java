package ua.itea.app.soapWS;

import ua.itea.app.dao.DaoImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:3036/dao", new DaoImpl());
    }
}
