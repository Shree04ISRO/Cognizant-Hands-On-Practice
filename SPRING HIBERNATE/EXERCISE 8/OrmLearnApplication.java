package com.cognizant.ormlearn;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static StockRepository stockRepository;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        stockRepository = context.getBean(StockRepository.class);

        testFacebookStocks();

        testGoogleStocks();

        testTop3Volume();

        testNetflixLowest();

    }

    // Facebook stocks in September 2019
    private static void testFacebookStocks() {

        LOGGER.info("Facebook Stocks - September 2019");

        List<Stock> stocks = stockRepository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019, 9, 1),
                LocalDate.of(2019, 9, 30));

        stocks.forEach(System.out::println);

    }

    // Google stocks where closing price > 1250
    private static void testGoogleStocks() {

        LOGGER.info("Google Stocks Closing Price > 1250");

        List<Stock> stocks =
                stockRepository.findByCodeAndCloseGreaterThan(
                        "GOOGL", 1250);

        stocks.forEach(System.out::println);

    }

    // Top 3 highest volume
    private static void testTop3Volume() {

        LOGGER.info("Top 3 Highest Volume");

        List<Stock> stocks =
                stockRepository.findTop3ByOrderByVolumeDesc();

        stocks.forEach(System.out::println);

    }

    // Lowest 3 Netflix prices
    private static void testNetflixLowest() {

        LOGGER.info("Lowest 3 Netflix Stocks");

        List<Stock> stocks =
                stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");

        stocks.forEach(System.out::println);

    }

}