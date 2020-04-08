/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.ArrayList;
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
public class Tarjeta implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTarjeta;
     private String titutlarTarjeta;
     private String numeroTarjeta;
     private String fechaCaducidad;
     private String codSeguridad;
     
     @JsonBackReference
     @JoinColumn(name="idCliente")
      @ManyToOne(fetch=FetchType.LAZY)
        private Cliente cliente;
     

    public Long getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getTitutlarTarjeta() {
        return titutlarTarjeta;
    }

    public void setTitutlarTarjeta(String titutlarTarjeta) {
        this.titutlarTarjeta = titutlarTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(String codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

     
}
