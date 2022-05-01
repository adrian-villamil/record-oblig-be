/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proy.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author adria
 */
@Entity
@Table(name = "obligaciones", schema = "record-oblig-db")
public class Obligacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_obligacion;
    
    private String nombre_obligacion;
    
    private LocalDate fecha_vencimiento;
    
    private int valor;
    
    private int periodicidad;
    
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    
    @OneToMany(mappedBy = "obligacion")
    private List<Pago> pagos;
    
    public Obligacion() {
        
    }

    public Obligacion(Long id_obligacion, String nombre_obligacion, LocalDate fecha_vencimiento, int valor, int periodicidad, Empresa empresa, List<Pago> pagos) {
        this.id_obligacion = id_obligacion;
        this.nombre_obligacion = nombre_obligacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.valor = valor;
        this.periodicidad = periodicidad;
        this.empresa = empresa;
        this.pagos = pagos;
    }

    public Long getId_obligacion() {
        return id_obligacion;
    }

    public void setId_obligacion(Long id_obligacion) {
        this.id_obligacion = id_obligacion;
    }

    public String getNombre_obligacion() {
        return nombre_obligacion;
    }

    public void setNombre_obligacion(String nombre_obligacion) {
        this.nombre_obligacion = nombre_obligacion;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
    
}
