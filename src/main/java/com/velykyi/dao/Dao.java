package com.velykyi.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

public interface Dao<T, ID> extends AutoCloseable {

    void create(T entity) throws Exception;

    T findById(ID id) throws NoSuchElementException;

    List<T> findAll() throws NoSuchElementException;

    void update(T entity);
    void delete(ID id);
    void close();



}
