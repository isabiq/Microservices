package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.models.RefFormeJuridique;

public interface RefFormeJuridiqueRepository extends Repository<RefFormeJuridique, Long>{
		List<RefFormeJuridique> findAll();
		RefFormeJuridique findById(Long id);
		RefFormeJuridique findByLibelle(String libelle);
}
