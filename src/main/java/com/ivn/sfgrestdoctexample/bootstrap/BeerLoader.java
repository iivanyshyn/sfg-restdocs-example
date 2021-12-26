package com.ivn.sfgrestdoctexample.bootstrap;

import com.ivn.sfgrestdoctexample.domain.Beer;
import com.ivn.sfgrestdoctexample.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Lvivske")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(254010000001L)
                    .price(new BigDecimal("20.54"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("First Brovarnia")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(254010000002L)
                    .price(new BigDecimal("18.54"))
                    .build());
        }
    }
}
