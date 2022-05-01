/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proy.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author adria
 */
@Entity
@Table(name = "empresas", schema = "record-oblig-db")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_empresa;
    
    private String nombre_empresa;
    
    private String nit_empresa;
    
    @OneToMany(mappedBy = "empresa")
    private List<Obligacion> obligaciones;
    
    public Empresa() {
        
    }

    public Empresa(Long id_empresa, String nombre_empresa, String nit_empresa, List<Obligacion> obligaciones) {
        this.id_empresa = id_empresa;
        this.nombre_empresa = nombre_empresa;
        this.nit_empresa = nit_empresa;
        this.obligaciones = obligaciones;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getNit_empresa() {
        return nit_empresa;
    }

    public void setNit_empresa(String nit_empresa) {
        this.nit_empresa = nit_empresa;
    }

    public List<Obligacion> getObligaciones() {
        return obligaciones;
    }

    public void setObligaciones(List<Obligacion> obligaciones) {
        this.obligaciones = obligaciones;
    }
    
    
    
    
}
