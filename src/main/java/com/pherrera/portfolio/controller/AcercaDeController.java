/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.AcercaDe;
import com.pherrera.portfolio.service.InterfaceAcercadeService;
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
public class AcercaDeController {
     @Autowired
    private InterfaceAcercadeService aceServ;
    
    @PostMapping("/acercade/new")
    public void agregarAcercaDe(@RequestBody AcercaDe acp){
        aceServ.crearAcercaDe(acp);
    }
    
    @GetMapping ("/acercade/ver")
    @ResponseBody 
    public List<AcercaDe> verAcercaDe(){
        return aceServ.verAcercaDe();
    }
    
    @DeleteMapping("/acercade/delete/{id}")
    public void borrarAcercaDe(@PathVariable long id){
        aceServ.borrarAcercaDe(id);
    }
    
    @PutMapping("/acercade/edit")
    public void editarAcercaDe(@RequestBody AcercaDe acd){
        aceServ.editarAcercaDe(acd);
    }
}
