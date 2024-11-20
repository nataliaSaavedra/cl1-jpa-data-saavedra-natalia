package pe.edu._3.cl1_jpa_data_saavedra_natalia.model.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class CountryLanguageId {
    private String countryCode;
    private String language;
}
