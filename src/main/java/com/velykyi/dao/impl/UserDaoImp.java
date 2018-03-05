package com.velykyi.dao.impl;

import com.velykyi.constant.db.TableParameters;
import com.velykyi.dao.AbstractDao;
import com.velykyi.dao.UserDao;
import com.velykyi.entity.full.User;

import java.sql.Connection;

public class UserDaoImp extends AbstractDao<User> implements UserDao  {

    public UserDaoImp(String tableName, Connection connection) {
        super(tableName, connection);
    }

    @Override
    public User findByEmail(String email) {
        return findOneByParameter(TableParameters.UserParam.EMAIL, email);

    }

    @Override
    public void create(User entity) throws Exception {

    }

    @Override
    public void update(User entity) {

    }
}
