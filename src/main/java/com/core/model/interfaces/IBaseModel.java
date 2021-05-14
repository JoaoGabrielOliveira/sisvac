package com.core.model.interfaces;
import java.sql.ResultSet;
import java.sql.SQLException;
public interface IBaseModel {
    public void mapToModel(ResultSet map) throws ReflectiveOperationException, SQLException;
}
