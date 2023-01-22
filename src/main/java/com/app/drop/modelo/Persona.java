package com.app.drop.modelo;

import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Data
public class Persona implements Serializable{
    
    private int idPer;
    private String nomPer;
    private String apePer;
    private String celPer;
    private String corPer;
    private String dniPer;
    private String usePer;
    private String conPer;
    private String tipPer;
    private String estPer;
    private int idUbi;
    private List<String> permisos;

}
