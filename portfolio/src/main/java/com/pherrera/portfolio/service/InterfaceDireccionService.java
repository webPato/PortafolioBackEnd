/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Direccion;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceDireccionService {
    public List<Direccion> verDireccion();
    public void crearDireccion (Direccion dir);
    public void borrarDireccion (Long id);
    public Direccion buscarDireccion (Long id);
    public void editarDireccion (Direccion dir);
}
