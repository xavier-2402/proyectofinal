/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class VehiculoConductor {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idVehiculoConductor;
    private boolean estadoVehiculo;
    
    //conductor-vehiculo_conductor
     @JsonBackReference
     @JoinColumn(name="idConductor")
      @ManyToOne(fetch=FetchType.LAZY)
     private Conductor conductor;
     
     //vehiculo_conductor-vechiculo
      @JsonBackReference
     @JoinColumn(name="idVehiculo")
      @ManyToOne(fetch=FetchType.LAZY)
     private Vehiculo vehiculo;
      
      //servicio- vehiculo_conductor
      @JsonManagedReference
      @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="vehiculoconductor")
      private List<Servicio> servicio;
    
}
