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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String entidad;
    private String titulo;
    private String duracion;
    private int id_persona;

    public Educacion() {
    }

    public Educacion(Long id, String entidad, String titulo, String duracion, int id_persona) {
        this.id = id;
        this.entidad = entidad;
        this.titulo = titulo;
        this.duracion = duracion;
        this.id_persona = id_persona;
    }


    
    
}
