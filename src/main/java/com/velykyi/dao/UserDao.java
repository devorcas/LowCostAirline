package com.velykyi.dao;

import com.velykyi.entity.full.User;

public interface UserDao extends Dao<User, Integer> {
    User findByEmail(String email); //throws NoResultFromDBExeption
}
