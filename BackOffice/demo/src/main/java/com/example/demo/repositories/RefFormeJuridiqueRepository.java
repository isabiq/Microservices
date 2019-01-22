package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.RefFormeJuridique;

/**
 * @author y.nadir
 *
 */
public interface RefFormeJuridiqueRepository extends JpaRepository<RefFormeJuridique, Long> {
    List<RefFormeJuridique> findByLibelle(String libelle);
}
