/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Localidad;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceLocalidadService {
        public List<Localidad> verLocalidad();
    public void crearLocalidad (Localidad loc);
    public void borrarLocalidad (Long id);
    public Localidad buscarLocalidad (Long id);
    public void editarLocalidad (Localidad loc);
}
