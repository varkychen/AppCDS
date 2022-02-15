package com.bojug.appcds.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Optional<City> fetchCity() {
        return cityRepository.findById((long) new Random().nextInt(100));
    }
}
