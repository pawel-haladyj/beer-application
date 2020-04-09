package pl.haladyj.edgeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.haladyj.edgeservice.configuration.MyBeerConfiguration;
import pl.haladyj.edgeservice.hystrix.BeerClientFallback;
import pl.haladyj.edgeservice.model.Beer;

import java.util.List;

@FeignClient(
        value = "beerClient",
        url = "localhost:8301/api/",
        configuration = MyBeerConfiguration.class,
        fallback = BeerClientFallback.class)
public interface BeerClient {
    @GetMapping(value = "/beer/{id}")
    Beer getBeerById(@PathVariable("id") Long id);

    @GetMapping(value = "/beers")
    List<Beer> getAllBeer();
}
