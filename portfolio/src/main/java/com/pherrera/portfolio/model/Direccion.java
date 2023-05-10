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
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String calle;
    private int numero;
    private int piso;
    private String dpto;
    private int id_localidad;

    public Direccion() {
    }

    public Direccion(Long id, String calle, int numero, int piso, String dpto, int id_localidad) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.dpto = dpto;
        this.id_localidad = id_localidad;
    }


    
    
    
}
