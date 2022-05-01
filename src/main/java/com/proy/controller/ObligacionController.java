/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proy.controller;

import com.proy.model.Obligacion;
import com.proy.repository.EmpresaRepository;
import com.proy.repository.ObligacionRepository;
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
public class ObligacionController {
    
    @Autowired
    EmpresaRepository empresaRepository;
    
    @Autowired
    ObligacionRepository obligacionRepository;
    
    @GetMapping("/obligaciones")
    public List<Obligacion> findAll() {
        return obligacionRepository.findAll();
    }
    
    @GetMapping("/obligaciones/{id}")
    public Optional<Obligacion> findById(@PathVariable Long id) {
        return obligacionRepository.findById(id);
    }
    
    @PostMapping("/obligaciones")
    public String savePost(@RequestBody Obligacion obligacion) {
        obligacionRepository.save(obligacion);
        return "ok";
    }
    
    @DeleteMapping("/obligaciones/{id}")
    public String delete(@PathVariable Long id) {
        obligacionRepository.deleteById(id);
        return "ok";
    }
    
}
