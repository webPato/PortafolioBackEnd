/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.controller;

import com.pherrera.portfolio.model.Cursos;
import com.pherrera.portfolio.service.InterfaceCursosService;
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
public class CursosController {
       @Autowired
    private InterfaceCursosService curServ;
    
    @PostMapping("/cursos/new")
    public void agregarCursos(@RequestBody Cursos cur){
        curServ.crearCursos(cur);
    }
    
    @GetMapping ("/cursos/ver")
    @ResponseBody 
    public List<Cursos> verCursos(){
        return curServ.verCursos();
    }
    
    @DeleteMapping("cursos/delete/{id}")
    public void borrarCursos(@PathVariable long id){
        curServ.borrarCursos(id);
    }
    
    @PutMapping("/cursos/edit")
    public void editarCursos(@RequestBody Cursos cur){
        curServ.editarCursos(cur);
    }
}
