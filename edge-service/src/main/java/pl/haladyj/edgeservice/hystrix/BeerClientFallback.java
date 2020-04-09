package pl.haladyj.edgeservice.hystrix;

import org.springframework.stereotype.Component;
import pl.haladyj.edgeservice.client.BeerClient;
import pl.haladyj.edgeservice.model.Beer;

import java.util.Collections;
import java.util.List;

@Component
public class BeerClientFallback implements BeerClient {

    @Override
    public Beer getBeerById(Long id) {
        Beer beer = new Beer("Service out of use - NO BEER AVAILABLE");
        return null;
    }

    @Override
    public List<Beer> getAllBeer() {
        return Collections.emptyList();
    }
}
