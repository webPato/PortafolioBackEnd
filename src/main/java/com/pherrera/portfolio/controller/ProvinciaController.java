/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Provincia;
import com.pherrera.portfolio.service.InterfaceProvinciaService;
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
public class ProvinciaController {
     @Autowired
    private InterfaceProvinciaService proServ;
    
    @PostMapping("/provincia/new")
    public void agregarProvincia(@RequestBody Provincia pro){
        proServ.crearProvincia(pro);
    }
    
    @GetMapping ("/provincia/ver")
    @ResponseBody 
    public List<Provincia> verProvincia(){
        return proServ.verProvincia();
    }
    
    @DeleteMapping("/provincia/delete/{id}")
    public void borrarProvincia(@PathVariable long id){
        proServ.borrarProvincia(id);
    }
    
    @PutMapping("/provincia/edit")
    public void editarProvincia(@RequestBody Provincia prov){
        proServ.editarProvincia(prov);
    }
}
