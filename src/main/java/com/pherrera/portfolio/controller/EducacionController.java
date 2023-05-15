/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Educacion;
import com.pherrera.portfolio.service.InterfaceEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://portfolio-frontend-pherrera.web.app","http://localhost:4200"})
public class EducacionController {
     @Autowired
    private InterfaceEducacionService eduServ;
    
    @PostMapping("/educacion/new")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/educacion/ver")
    @ResponseBody 
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    @DeleteMapping("/educacion/delete/{id}")
    public void borrarEducacion(@PathVariable long id){
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping("/educacion/edit")
    public void editarEducacion(@RequestBody Educacion edu){
        eduServ.editarEducacion(edu);
    }
}
