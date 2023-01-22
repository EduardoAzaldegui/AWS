package com.app.drop.RestController;

import com.app.drop.dao.ICrudImpl;
import com.app.drop.modelo.Persona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class EmpleadoC{


    //METODOS IMPLEMENTADOS
    @PostMapping("/empleados")
    public void agregar(@RequestBody Persona modelo) {

    }

    @PutMapping("/empleados")
    public void editar(@RequestBody Persona modelo) {

    }

    @DeleteMapping("/empleados/{id}")
    public void eliminar(@PathVariable int id) {

    }

    @GetMapping("/empleados")
    public String listar() {
        return "PruebaServicio";
    }

    @PatchMapping("/empleados/{id}")
    public void restaurar(@PathVariable int id) {

    }


    public void usarServicio(String servicio) {
    }
    
}
