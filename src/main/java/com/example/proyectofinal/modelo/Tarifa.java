/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Tarifa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTarifa;
    private double valor;
    private String tarifa_descripcion;
    
    
    
    
}
