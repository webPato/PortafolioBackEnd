/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Proyectos;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceProyectosService {
        public List<Proyectos> verProyectos();
    public void crearProyectos (Proyectos proy);
    public void borrarProyectos (Long id);
    public Proyectos buscarProyectos (Long id);
    public void editarProyectos (Proyectos proy);
}
