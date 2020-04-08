/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinal.controlador;


import com.example.proyectofinal.modelo.VehiculoConductor;
import com.example.proyectofinal.repositorio.VehiculoConductor_repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jessica Alvarez
 */

@RestController
@RequestMapping("vehiculoconductor")
public class VechiculoConductor_controller {
     @Autowired
      VehiculoConductor_repository vehiculoconductor_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<VehiculoConductor> listar() {
		return this.vehiculoconductor_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public VehiculoConductor guardar(@RequestBody VehiculoConductor vc) {
		return this.vehiculoconductor_repository.save(vc);
	}
    
        @GetMapping("/{idVehiculoConductor}")
	@CrossOrigin
	public VehiculoConductor recuperar(@PathVariable Long idVehiculoConductor) {
		return this.vehiculoconductor_repository.findById(idVehiculoConductor).get();
	}
	@DeleteMapping("/{idVehiculoConductor}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idVehiculoConductor) {
		this.vehiculoconductor_repository.deleteById(idVehiculoConductor);
	}
    
}
