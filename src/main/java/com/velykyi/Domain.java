package com.velykyi;

import com.velykyi.dao.connectionPool.ConnectionPoolHolder;

public class Domain {
    public static void main(String[] args) {
        ConnectionPoolHolder connectionPoolHolder = new ConnectionPoolHolder();
        ConnectionPoolHolder.getDataSource();
    }
}
