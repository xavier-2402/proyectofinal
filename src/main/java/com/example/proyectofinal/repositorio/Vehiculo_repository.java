/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.repositorio;

import com.example.proyectofinal.modelo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jessica Alvarez
 */

@Repository
public interface Vehiculo_repository extends JpaRepository<Vehiculo,Long> {
    
}
