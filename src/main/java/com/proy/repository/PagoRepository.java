/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proy.repository;

import com.proy.model.Pago;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adria
 */
@Repository
public interface PagoRepository extends CrudRepository<Pago, Long> {

    @Override
    public void deleteById(Long id);

    @Override
    public List<Pago> findAll();

    @Override
    public Optional<Pago> findById(Long id);

    @Override
    public <S extends Pago> S save(S entity);
    
}
