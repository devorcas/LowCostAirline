package com.velykyi.dao;

import com.velykyi.dao.util.QueryContainer;
import com.velykyi.entity.Entity;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractDao<T extends Entity<Integer>> implements Dao<T, Integer> {

    private String tableName;

    public Connection connection;

    public AbstractDao(String tableName, Connection connection) {
        this.tableName = tableName;
        this.connection = connection;
    }

    @Override
    public T findById(Integer id) throws NoSuchElementException {
        String query = QueryContainer.INSTANCE.findFromTableById(tableName,id);
        return findOneByQuery(query);
    }

    private T findOneByQuery(String query) {
        return null;
    }

    @Override
    public List<T> findAll() throws NoSuchElementException {
        String query = QueryContainer.INSTANCE.findAllFromTable(tableName);
        return findAllByQuery(query);
    }

    private List<T> findAllByQuery(String query) {
            return null;
    }


    @Override
    public void delete(Integer id) {
        String query = QueryContainer.INSTANCE.deleteFromTabbleById(tableName, id);
        try  (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected T findOneByParameter(String parameterName, String parameterValue){
        String query = QueryContainer.INSTANCE.findAllFromTableByParameter(tableName, parameterName, parameterValue);
        return findOneByQuery(query);
    }
}
