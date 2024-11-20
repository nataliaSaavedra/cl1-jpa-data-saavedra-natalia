package pe.edu._3.cl1_jpa_data_saavedra_natalia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu._3.cl1_jpa_data_saavedra_natalia.model.Country;
import pe.edu._3.cl1_jpa_data_saavedra_natalia.repository.CountryRepository;

import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataSaavedraNataliaApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataSaavedraNataliaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		obtenerLenguajes();

		countryRepository.deleteById("COL");
		countryRepository.deleteById("ARG");
		System.out.println("Eliminando COL y ARG");
		System.out.println("==============================");

		obtenerLenguajes();
	}

	private void obtenerLenguajes() {
		Optional<Country> countryArg = countryRepository.findById("ARG");
		countryArg.ifPresentOrElse(
				country -> {
					System.out.println("Lenguajes de Argentina");
					country.getLanguages().forEach(lang -> System.out.println(lang.getId().getLanguage()));
				},
				() -> {
					Optional<Country> countryPeru = countryRepository.findById("PER");
					countryPeru.ifPresentOrElse(
							country -> {
								System.out.println("Lenguajes de Perú");
								country.getLanguages().forEach(lang -> System.out.println(lang.getId().getLanguage()));
							},
							() -> System.out.println("Error: Datos no encontrados")
					);
				}
		);
		System.out.println("==============================");
	}
}