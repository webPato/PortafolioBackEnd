/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pherrera.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pherrera
 */
@Getter @Setter
@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String entidad; 
    private String fecha;    
    private int id_persona;

    public Cursos() {
    }

    public Cursos(Long id, String titulo, String entidad, String fecha, int id_persona) {
        this.id = id;
        this.titulo = titulo;
        this.entidad = entidad;
        this.fecha = fecha;
        this.id_persona = id_persona;
    }



    
    
}
