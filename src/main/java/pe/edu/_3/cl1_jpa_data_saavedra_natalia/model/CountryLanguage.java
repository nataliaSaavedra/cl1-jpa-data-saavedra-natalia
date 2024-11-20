package pe.edu._3.cl1_jpa_data_saavedra_natalia.model;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu._3.cl1_jpa_data_saavedra_natalia.model.pk.CountryLanguageId;

@Data
@Table(name = "countryLanguage")
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "CountryCode", updatable = false, insertable = false)
    private Country country;
    @Column(name = "IsOfficial")
    private String isOfficial;
    @Column(name = "Percentage")
    private Double percentage;
}
