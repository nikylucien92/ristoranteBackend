package app.ristorante.ristoranteBackend.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.ristorante.ristoranteBackend.entity.Tavolo;
import app.ristorante.ristoranteBackend.repository.RepositoryTavolo;

@Service
public class ServiceImplementTavolo implements ServiceTavolo{

	private RepositoryTavolo repositoryTavolo;
	
	@Autowired
	public ServiceImplementTavolo(RepositoryTavolo repositoryTavolo) {
		this.repositoryTavolo=repositoryTavolo;
	}

	@Override
	@Transactional
	public Optional<Tavolo> getTavoloById(Long cod_tavolo) {

        return repositoryTavolo.findById(cod_tavolo);
}

	@Override
	@Transactional
	public Tavolo addTavolo(Tavolo tavolo) {

		return repositoryTavolo.save(tavolo);
	}
	
	@Override
	@Transactional
	 public List<Tavolo> findAllTables(){
		 return repositoryTavolo.findAll();
	 }

}
