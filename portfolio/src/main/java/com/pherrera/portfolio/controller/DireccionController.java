/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Direccion;
import com.pherrera.portfolio.service.InterfaceDireccionService;
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
public class DireccionController {
     @Autowired
    private InterfaceDireccionService dirServ;
    
    @PostMapping("/direccion/new")
    public void agregarDireccion(@RequestBody Direccion dir){
        dirServ.crearDireccion(dir);
    }
    
    @GetMapping ("/direccion/ver")
    @ResponseBody 
    public List<Direccion> verDireccion(){
        return dirServ.verDireccion();
    }
    
    @DeleteMapping("/direccion/delete/{id}")
    public void borrarDireccion(@PathVariable long id){
        dirServ.borrarDireccion(id);
    }
    
    @PutMapping("/direccion/edit")
    public void editarDireccion(@RequestBody Direccion dir){
        dirServ.editarDireccion(dir);
    }
}
