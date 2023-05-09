/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Localidad;
import com.pherrera.portfolio.service.InterfaceLocalidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pherrera
 */
@RestController
public class LocalidadController {
      @Autowired
    private InterfaceLocalidadService locServ;
    
    @PostMapping("/localidad/new")
    public void agregarLocalidad(@RequestBody Localidad loc){
        locServ.crearLocalidad(loc);
    }
    
    @GetMapping ("/localidad/ver")
    @ResponseBody 
    public List<Localidad> verLocalidad(){
        return locServ.verLocalidad();
    }
    
    @DeleteMapping("/localidad/delete/{id}")
    public void borrarLocalidad(@PathVariable long id){
        locServ.borrarLocalidad(id);
    }
    
    @PutMapping("/localidad/edit")
    public void editarLocalidad(@RequestBody Localidad loc){
        locServ.editarLocalidad(loc);
    }
}
