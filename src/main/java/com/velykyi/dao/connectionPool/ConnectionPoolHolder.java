package com.velykyi.dao.connectionPool;

import com.velykyi.constant.propertyKeys.Config;
import com.velykyi.util.properties.PropertyManager;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

public class ConnectionPoolHolder {

    private static volatile DataSource dataSource;

    public static DataSource getDataSource(){
        if (dataSource == null){
            synchronized (ConnectionPoolHolder.class){
                if (dataSource == null){
                    BasicDataSource ds = new BasicDataSource();
                    ds.setUrl(PropertyManager.CONFIG.getString(Config.DB_URL));
                    ds.setUsername(PropertyManager.CONFIG.getString(Config.DB_USER));
                    ds.setPassword(PropertyManager.CONFIG.getString(Config.DB_PASSWORD));
                    ds.setMinIdle(Integer.parseInt(PropertyManager.CONFIG.getString(Config.DB_MAX_IDLE)));
                    ds.setMaxIdle(Integer.parseInt(PropertyManager.CONFIG.getString(Config.DB_MAX_IDLE)));
                    dataSource = ds;
                }
            }
        }
        System.out.println("connection ok");
        return dataSource;
    }
}
