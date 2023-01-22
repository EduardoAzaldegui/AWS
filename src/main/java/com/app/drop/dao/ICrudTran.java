package com.app.drop.dao;

import java.io.Serializable;
import java.util.List;


public interface ICrudTran<T,V> extends Serializable{
    
    void agregar(T item);
    
    void agregarDetalle(List<V> itemDetalle);
    
    List<T> listar();
    
}
