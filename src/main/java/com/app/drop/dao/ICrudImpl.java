package com.app.drop.dao;

import java.io.Serializable;
import java.util.List;


public interface ICrudImpl <T> extends Serializable{
    
  public void agregar(T item);
  
  public void editar(T item);
  
  public void eliminar(int id);
  
  public void restaurar(int id);
  
  public List<T> listar(String filtro);
  
}

