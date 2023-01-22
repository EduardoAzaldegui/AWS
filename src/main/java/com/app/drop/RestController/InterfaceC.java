package com.app.drop.RestController;

import java.io.Serializable;
import java.util.List;


public interface InterfaceC <T> extends Serializable{
    
    public void agregar(T modelo);
    
    public void editar(T modelo);
    
    public void eliminar(int id);
    
    public List<T> listar();
    
    public void restaurar(int id);
    
    public void usarServicio(String servicio);
    
}
