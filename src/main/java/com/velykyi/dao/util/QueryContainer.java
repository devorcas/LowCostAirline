package com.velykyi.dao.util;

public enum  QueryContainer {

    INSTANCE;

    public String findAllFromTable(String tableName){
        return "SELECT * FROM " + tableName;
    }

    public String findFromTableById(String tableName, Integer id){
        return "SELECT * FROM " + tableName + " WHERE id = " + id;
    }

    public String deleteFromTabbleById(String tableName, Integer id){
        return "DELETE FROM " + tableName + " WHERE id = \"" + id + "\";";
    }

    public String findAllFromTableByParameter(String tableName,
                                              String parameterName,
                                              String parameterValue) {
        return "SELECT * FROM " + tableName + " WHERE " + parameterName +
                " = \"" + parameterValue + "\";";
    }

    public String findForeignKeyIdFromTable(String tableName, String entityId, String idName){
        return "SELECT " + idName + " FROM " + tableName + " WHERE id = \"" + entityId + "\";";
    }

    //TODO QWERYcontainer
}
