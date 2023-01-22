package com.app.drop.dao;

import java.sql.Connection;
import java.sql.ResultSet;



public interface IDatabase {
    
    public Connection obtenerConexion();
    
    public ResultSet obtenerDatos(String query);
    
    public void actualizarDatos(String query);
    
    public void cerrarConexion();
    
}
