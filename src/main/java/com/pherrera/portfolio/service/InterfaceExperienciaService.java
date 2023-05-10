/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.service;

import com.pherrera.portfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author pherrera
 */
public interface InterfaceExperienciaService {
    public List<Experiencia> verExperiencia();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    public void editarExperiencia (Experiencia exp);
}
