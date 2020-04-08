/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idServicio;
    private Date fecha_servicio;
    
    //servicio-vehiculo_conductor
    @JsonBackReference
     @JoinColumn(name="idVehiculoConductor")
      @ManyToOne(fetch=FetchType.LAZY)
     private VehiculoConductor vehiculo_conductor;
    
    //servicio-cliente_direcciones
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idClienteDireccion", referencedColumnName = "id")
    private ClienteDirecciones cliente_direcciones;
}
