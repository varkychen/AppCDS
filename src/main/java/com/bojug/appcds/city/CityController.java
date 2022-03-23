package com.bojug.appcds.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping(path = "/")
    City fetchCities() {
        return cityService.fetchCity().get();
    }
}


