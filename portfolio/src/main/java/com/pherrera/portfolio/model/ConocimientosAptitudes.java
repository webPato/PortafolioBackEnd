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
public class ConocimientosAptitudes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String descripcion;
    private int id_persona;

    public ConocimientosAptitudes() {
    }

    public ConocimientosAptitudes(Long id, String descripcion, int id_persona) {
        this.id = id;
        this.descripcion = descripcion;
        this.id_persona = id_persona;
    }


    
    
    
}
