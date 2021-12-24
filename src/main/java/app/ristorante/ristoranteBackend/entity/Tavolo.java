package app.ristorante.ristoranteBackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="tavolo")
public class Tavolo {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column
	 @NotNull
	 private Long cod_tavolo ;
	 @NotNull
	 @Column
	 private Long postiOccupati;
}
