package org.app;

import com.app.DaoImpl;
import com.app.DaoImplService;

public class Main {

    public static void main(String[] args) {

        DaoImplService daoImplService=new DaoImplService();

        DaoImpl dao=daoImplService.getDaoImplPort();

    }

}
