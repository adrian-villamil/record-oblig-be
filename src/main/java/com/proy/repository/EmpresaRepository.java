/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proy.repository;

import com.proy.model.Empresa;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adria
 */
@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

    @Override
    public void deleteById(Long id);

    @Override
    public List<Empresa> findAll();

    @Override
    public Optional<Empresa> findById(Long id);

    @Override
    public <E extends Empresa> E save(E entity);
    
}
