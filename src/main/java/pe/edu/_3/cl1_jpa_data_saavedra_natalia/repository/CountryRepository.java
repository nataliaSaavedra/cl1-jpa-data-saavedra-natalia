package pe.edu._3.cl1_jpa_data_saavedra_natalia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu._3.cl1_jpa_data_saavedra_natalia.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
}
