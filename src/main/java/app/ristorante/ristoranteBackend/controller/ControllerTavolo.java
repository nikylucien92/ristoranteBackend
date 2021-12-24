package app.ristorante.ristoranteBackend.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.ristorante.ristoranteBackend.entity.Tavolo;
import app.ristorante.ristoranteBackend.service.ServiceTavolo;

@RestController
@CrossOrigin(origins="http://localhost:3306")
@RequestMapping(value="/tavolo")
public class ControllerTavolo {

	private ServiceTavolo serviceTavolo;
	
	@Autowired 
	public ControllerTavolo(ServiceTavolo serviceTavolo) {
		 this.serviceTavolo=serviceTavolo;
	 }
	
	@GetMapping("")
	public List<Tavolo> getAllTables(){
	
		return serviceTavolo.findAllTables();
	}
	
	@GetMapping("/cod_tavolo")
	public Optional<Tavolo> getTable(@PathVariable(value = "cod_tavolo") Long cod_tavolo){
	
		
		return serviceTavolo.getTavoloById(cod_tavolo);
	}
	
	@PostMapping("/aggiungiTavolo")
	public Tavolo aggiungiTavolo(@RequestBody Tavolo tavolo)
	{		
		return serviceTavolo.addTavolo(tavolo);
		
	}
}

/*
 *   try {
            User user = userService.getUser(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
 * */
