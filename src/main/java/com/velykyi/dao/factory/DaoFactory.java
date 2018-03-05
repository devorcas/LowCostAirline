package com.velykyi.dao.factory;

import com.velykyi.dao.Dao;
import com.velykyi.dao.FlightDao;
import com.velykyi.dao.TiсketDao;
import com.velykyi.dao.UserDao;

import java.sql.Connection;

public abstract class DaoFactory {

    private static volatile DaoFactory daoFactory;

    public abstract UserDao createUserDao(Connection connection);
    public abstract FlightDao createFlightDao(Connection connection);
    public abstract TiсketDao createTiсketDao(Connection connection);

    public static DaoFactory getInstance(){
        if (daoFactory == null){
            synchronized (DaoFactory.class){
                if (daoFactory == null){
                    DaoFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}
