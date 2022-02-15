package com.bojug.appcds.city;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class City {
    @Id
    private Long id;

    @Column(name = "CountryCode")
    private String countryCode;
    private String district;
    private String name;
    private Long population;
}
