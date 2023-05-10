/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.ConocimientosAptitudes;
import com.pherrera.portfolio.service.InterfaceConocimientosAptitudesService;
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
    
    @DeleteMapping("/aptitudes/delete/{id}")
    public void borrarConocimientosAptitudes(@PathVariable long id){
        conapServ.borrarConocimientosAptitudes(id);
    }
    
    @PutMapping("/aptitudes/edit")
    public void editarConocimientosAptitudes(@RequestBody ConocimientosAptitudes cona){
        conapServ.editarConocimientosAptitudes(cona);
    }
    
}
