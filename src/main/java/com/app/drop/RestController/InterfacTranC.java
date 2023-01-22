package com.app.drop.RestController;

import java.io.Serializable;
import java.util.List;


public interface InterfacTranC<T,U> extends Serializable{
    
    void addEncabezado(U encabezado);
 
    void addItems(List<T> items);
}
