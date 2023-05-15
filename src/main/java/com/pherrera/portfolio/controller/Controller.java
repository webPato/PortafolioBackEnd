/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Persona;
import com.pherrera.portfolio.service.InterfacePersonaService;
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
public class Controller {
    
    @GetMapping ("/portfolio")
    public String testPortfolio(){
        return "Portfolio AP-4";
    }
  /*  
    @GetMapping("/portfolioparam")
    public String testPortfolioParam(@RequestParam String nombre,
                            @RequestParam String apellido,
                            @RequestParam int edad){
        return "testPortfolioParam" + nombre + " Apellido: " + apellido + " Edad: " + edad;
    }*/
        
    @Autowired
    private InterfacePersonaService persServ;
    
    @PostMapping("/persona/new")
    public void agregarPersonas(@RequestBody Persona pers){
        persServ.crearPersona(pers);
    }
    
    @GetMapping ("/persona/ver")
    @ResponseBody 
    public List<Persona> verPersonas(){
        return persServ.verPersonas();
    }
    
    @DeleteMapping("/persona/delete/{id}")
    public void borrarPersona(@PathVariable long id){
        persServ.borrarPersona(id);
    }
    
    @PutMapping("/persona/edit")
    public void editarPersonas(@RequestBody Persona pers){
        persServ.editarPersona(pers);
    }
    
}
