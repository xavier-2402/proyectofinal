/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Vehiculo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVehiculo;
    private String v_matricula;
    private String v_tipo;
    private String v_color;
    private String v_marca;
    private String v_anio;
    private String v_largo;
    private String v_ancho;
    
    //vehiculo_conductor-vehiculo
    @JsonBackReference
    @JoinColumn(name="idVehiculoConductor")
    @ManyToOne(fetch=FetchType.LAZY)
    private VehiculoConductor vehiculo_conductor;
    
    
}
