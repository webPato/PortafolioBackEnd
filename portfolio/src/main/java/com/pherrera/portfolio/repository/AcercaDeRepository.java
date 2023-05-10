/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pherrera.portfolio.repository;

import com.pherrera.portfolio.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pherrera
 */
@Repository
public interface AcercaDeRepository extends JpaRepository <AcercaDe, Long > {
    
}
