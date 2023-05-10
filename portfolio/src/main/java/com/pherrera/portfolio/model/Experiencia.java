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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String cargo;
    private String jornada;
    private String tiempo;
    private String descripcion;
    private int id_direccion;
    private int id_persona;

    public Experiencia() {
    }

    public Experiencia(Long id, String titulo, String cargo, String jornada, String tiempo, String descripcion, int id_direccion, int id_persona) {
        this.id = id;
        this.titulo = titulo;
        this.cargo = cargo;
        this.jornada = jornada;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
        this.id_direccion = id_direccion;
        this.id_persona = id_persona;
    }


    
}
