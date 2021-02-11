package com.farah.projet.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farah.projet.entities.Billet;

public interface BilletRepository extends JpaRepository<Billet, Long> {

	
	
}