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

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Cliente implements Serializable{
    
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
     
    @JsonBackReference
    @JoinColumn(name="idPersona")
    @ManyToOne(fetch=FetchType.LAZY)
    private Persona persona;
    
    @JsonManagedReference
    //refencia cliente-tarjeta
    @OneToMany(mappedBy = "cliente",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Tarjeta>tarjeta;
    
    @JsonManagedReference
    //refencia cliente-clientedirecciones
    @OneToMany(mappedBy = "cliente",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<ClienteDirecciones>cliente_direcciones;

    public List<ClienteDirecciones> getCliente_direcciones() {
        return cliente_direcciones;
    }

    public void setCliente_direcciones(List<ClienteDirecciones> cliente_direcciones) {
        this.cliente_direcciones = cliente_direcciones;
    }
    
      


              
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<Tarjeta> getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(List<Tarjeta> tarjeta) {
        this.tarjeta = tarjeta;
    }
    

   
    
     
    
    
}
