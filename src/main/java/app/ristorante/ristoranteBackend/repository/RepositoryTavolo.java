package app.ristorante.ristoranteBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import app.ristorante.ristoranteBackend.entity.Tavolo;

@Repository
public interface RepositoryTavolo  extends JpaRepository<Tavolo,Long>{
	
}
