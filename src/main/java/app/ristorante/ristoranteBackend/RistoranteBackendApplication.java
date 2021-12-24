package app.ristorante.ristoranteBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// OR Annotation @Configuration
//@EnableAutoConfiguration, and @ComponentScan utilizzate entrambe insieme
public class RistoranteBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RistoranteBackendApplication.class, args);
	}

}
