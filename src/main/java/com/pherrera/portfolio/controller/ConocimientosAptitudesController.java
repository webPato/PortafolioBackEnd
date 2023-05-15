/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.ConocimientosAptitudes;
import com.pherrera.portfolio.service.InterfaceConocimientosAptitudesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pherrera
 */
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://portfolio-frontend-pherrera.web.app","http://localhost:4200"})
public class ConocimientosAptitudesController {
    @Autowired
    private InterfaceConocimientosAptitudesService conapServ;
    
    @PostMapping("/aptitudes/new")
    public void agregarConocimientosAptitudes(@RequestBody ConocimientosAptitudes con){
        conapServ.crearConocimientosAptitudes(con);
    }
    
    @GetMapping ("/aptitudes/ver")
    @ResponseBody 
    public List<ConocimientosAptitudes> verConocimientosAptitudes(){
        return conapServ.verConocimientosAptitudes();
    }    
    
    @GetMapping("/aptitudes/ver/{id}")	
    public ResponseEntity<ConocimientosAptitudes> getById(@PathVariable("id") Long id){
        Optional<ConocimientosAptitudes> optionalAti = conapServ.findById(id);
        if(optionalAti.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    ConocimientosAptitudes apt = optionalAti.get();
    return new ResponseEntity<>(apt, HttpStatus.OK);
    }
    
    @DeleteMapping("/aptitudes/delete/{id}")
    public void borrarConocimientosAptitudes(@PathVariable long id){
        conapServ.borrarConocimientosAptitudes(id);
    }
    
    @PutMapping("/aptitudes/edit")
    public void editarConocimientosAptitudes(@RequestBody ConocimientosAptitudes cona){
        conapServ.editarConocimientosAptitudes(cona);
    }
        
     @PutMapping("/aptitudes/edit/{id}")
       public ConocimientosAptitudes editConocimientosAptitudes (@PathVariable Long id,
                                  @RequestParam ("descripcion") String newDescripcion,
                                  @RequestParam ("id_persona") Long newId_persona
                                  ){
        ConocimientosAptitudes conap = conapServ.buscarConocimientosAptitudes(id);
        conap.setDescripcion(newDescripcion);
        conap.setId_persona(1);
        
        conapServ.crearConocimientosAptitudes(conap);
        return conap;
       }
    
}
