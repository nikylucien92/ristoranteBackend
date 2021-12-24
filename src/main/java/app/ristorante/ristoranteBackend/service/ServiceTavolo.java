package app.ristorante.ristoranteBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import app.ristorante.ristoranteBackend.entity.Tavolo;

@Component
public interface ServiceTavolo {

	public Optional<Tavolo> getTavoloById(Long cod_tavolo);
	public Tavolo addTavolo(Tavolo tavolo);
	 public List<Tavolo> findAllTables();
	 }
