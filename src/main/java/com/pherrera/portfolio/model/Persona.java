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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private int dni;
    private String fechaNac;
    private int tel;
    private String email;
    int id_profesion;
    int id_direccion;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int dni, String fechaNac, int tel, String email, int id_profesion, int id_direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.tel = tel;
        this.email = email;
        this.id_profesion = id_profesion;
        this.id_direccion = id_direccion;
    }
    
    
    
}
