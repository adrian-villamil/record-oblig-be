/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proy.controller;

import com.proy.model.Pago;
import com.proy.repository.PagoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adria
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PagoController {
    
    @Autowired
    PagoRepository pagoRepository;
    
    @GetMapping("/pagos")
    public List<Pago> findAll() {
        return pagoRepository.findAll();
    }
    
    @GetMapping("/pagos/{id}")
    public Optional<Pago> findById(@PathVariable Long id) {
        return pagoRepository.findById(id);
    }
    
    @PostMapping("/pagos")
    public String savePost(@RequestBody Pago pago) {
        pagoRepository.save(pago);
        return "ok";
    }
    
    @DeleteMapping("/pagos/{id}")
    public String delete(@PathVariable Long id) {
        pagoRepository.deleteById(id);
        return "ok";
    }
}
