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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    private String titulo;
    private String descripcion;
    private String fecha;
    private String link;
    private int id_persona;

    public Proyectos() {
    }

    public Proyectos(Long id, String titulo, String descripcion, String fecha, String link, int id_persona) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.link = link;
        this.id_persona = id_persona;
    }

    
    
    
}
