/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Profesion;
import com.pherrera.portfolio.service.InterfaceProfesionService;
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
public class ProfesionController {
      @Autowired
    private InterfaceProfesionService proServ;
    
    @PostMapping("/profesion/new")
    public void agregarProfesion(@RequestBody Profesion pro){
        proServ.crearProfesion(pro);
    }
    
    @GetMapping ("/profesion/ver")
    @ResponseBody 
    public List<Profesion> verProfesion(){
        return proServ.verProfesion();
    }
    
    @DeleteMapping("/profesion/delete/{id}")
    public void borrarProfesion(@PathVariable long id){
        proServ.borrarProfesion(id);
    }
    
    @PutMapping("/profesion/edit")
    public void editarProfesion(@RequestBody Profesion pro){
        proServ.editarProfesion(pro);
    }
}
