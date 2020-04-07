/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Direccion {
       @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDireccion;
       
        private String provincia_dir;
        private String canton_dir;
        private String parroquia_dir;
        private String barrio_dir;
        private String calle_dir;
        
        @OneToMany(mappedBy = "direccion", cascade=CascadeType.ALL)
        private List<Direccion> direccion = new ArrayList<>();

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getProvincia_dir() {
        return provincia_dir;
    }

    public void setProvincia_dir(String provincia_dir) {
        this.provincia_dir = provincia_dir;
    }

    public String getCanton_dir() {
        return canton_dir;
    }

    public void setCanton_dir(String canton_dir) {
        this.canton_dir = canton_dir;
    }

    public String getParroquia_dir() {
        return parroquia_dir;
    }

    public void setParroquia_dir(String parroquia_dir) {
        this.parroquia_dir = parroquia_dir;
    }

    public String getBarrio_dir() {
        return barrio_dir;
    }

    public void setBarrio_dir(String barrio_dir) {
        this.barrio_dir = barrio_dir;
    }

    public String getCalle_dir() {
        return calle_dir;
    }

    public void setCalle_dir(String calle_dir) {
        this.calle_dir = calle_dir;
    }

 
        
}
