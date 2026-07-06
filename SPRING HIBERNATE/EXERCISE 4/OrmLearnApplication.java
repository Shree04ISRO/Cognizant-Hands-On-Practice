package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        getAllCountriesTest();

        searchCountriesTest();

        getCountryTest();

        addCountryTest();
    }

    private static void getAllCountriesTest() {

        LOGGER.info("******** ALL COUNTRIES ********");

        List<Country> countries = countryService.getAllCountries();

        countries.forEach(System.out::println);
    }

    private static void searchCountriesTest() {

        LOGGER.info("******** SEARCH COUNTRIES ********");

        List<Country> countries =
                countryService.searchCountries("Ind");

        countries.forEach(System.out::println);
    }

    private static void getCountryTest() {

        LOGGER.info("******** FIND COUNTRY ********");

        try {

            Country country =
                    countryService.findCountryByCode("IN");

            LOGGER.debug("Country : {}", country);

        } catch (CountryNotFoundException e) {

            LOGGER.error(e.getMessage());

        }
    }

    private static void addCountryTest() {

        LOGGER.info("******** ADD COUNTRY TEST ********");

        Country country = new Country("NP", "Nepal");

        countryService.addCountry(country);

        try {

            Country addedCountry =
                    countryService.findCountryByCode("NP");

            LOGGER.debug("Added Country : {}", addedCountry);

        } catch (CountryNotFoundException e) {

            LOGGER.error(e.getMessage());

        }
    }
}