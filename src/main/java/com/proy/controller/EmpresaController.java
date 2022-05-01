/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proy.controller;

import com.proy.model.Empresa;
import com.proy.repository.EmpresaRepository;
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
public class EmpresaController {
    
    @Autowired
    EmpresaRepository empresaRepository;
    
    @GetMapping("/empresas")
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    @GetMapping("/empresas/{id}")
    public Optional<Empresa> findById(@PathVariable Long id) {
        return empresaRepository.findById(id);
    }

    @PostMapping("/empresas")
    public String savePost(@RequestBody Empresa empresa) {
        empresaRepository.save(empresa);
        return "ok";
    }

    @DeleteMapping("/empresas/{id}")
    public String delete(@PathVariable Long id) {
        empresaRepository.deleteById(id);
        return "ok";
    }
}
