package com.velykyi.dao.factory;

import com.velykyi.dao.FlightDao;
import com.velykyi.dao.TiсketDao;
import com.velykyi.dao.UserDao;

import java.sql.Connection;

public class JDBCDaoFactory extends DaoFactory {
    @Override
    public UserDao createUserDao(Connection connection) {
        return null;
    }

    @Override
    public FlightDao createFlightDao(Connection connection) {
        return null;
    }

    @Override
    public TiсketDao createTiсketDao(Connection connection) {
        return null;
    }
}
