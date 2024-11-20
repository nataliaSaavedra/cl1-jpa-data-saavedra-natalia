package pe.edu._3.cl1_jpa_data_saavedra_natalia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "Continent")
    private String continent;
    @Column(name = "Region")
    private String region;
    @Column(name = "SurfaceArea")
    private Double surfaceArea;
    @Column(name = "IndepYear")
    private Integer indepYear;
    @Column(name = "Population")
    private Integer population;
    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;
    @Column(name = "GNP")
    private Double gnp;
    @Column(name = "GNPOld")
    private Double gnpOld;
    @Column(name = "LocalName")
    private String localName;
    @Column(name = "GovernmentForm")
    private String governmentForm;
    @Column(name = "HeadOfState")
    private String headOfState;
    @Column(name = "Capital")
    private Integer capital;
    @Column(name = "Code2")
    private String code2;
    @OneToMany(mappedBy = "country", cascade = CascadeType.REMOVE)
    private List<City> cities;
    @OneToMany(mappedBy = "country", cascade = CascadeType.REMOVE)
    private List<CountryLanguage> languages;
}
