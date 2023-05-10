/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Proyectos;
import com.pherrera.portfolio.service.InterfaceProyectosService;
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
public class ProyectosController {
       @Autowired
    private InterfaceProyectosService proyServ;
    
    @PostMapping("/proyectos/new")
    public void agregarProyectos(@RequestBody Proyectos pro){
        proyServ.crearProyectos(pro);
    }
    
    @GetMapping ("/proyectos/ver")
    @ResponseBody 
    public List<Proyectos> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @DeleteMapping("/proyectos/delete/{id}")
    public void borrarProyectos(@PathVariable long id){
        proyServ.borrarProyectos(id);
    }
    
    @PutMapping("/proyectos/edit")
    public void editarProyectos(@RequestBody Proyectos proy){
        proyServ.editarProyectos(proy);
    }
    
}


