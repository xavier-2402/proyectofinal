/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
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
import javax.persistence.OneToOne;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Conductor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idConductor;
    
    @JsonBackReference
    @JoinColumn(name="idPersona")
    @ManyToOne(fetch=FetchType.LAZY)
    private Persona persona;
    
    //conductor-direccion
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idDirecciones")
    private Direccion direccion;
    
    //conductor-vehiculo_conductor
    @JsonManagedReference
    @OneToMany(mappedBy = "conductor", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List <VehiculoConductor> conductor;
        
    

    public Long getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Long idConductor) {
        this.idConductor = idConductor;
    }

  
    
    
    
    
}
