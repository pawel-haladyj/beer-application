package pl.haladyj.beercatalogservice.service;

import pl.haladyj.beercatalogservice.model.Beer;

import java.util.List;

public interface BeerService {
    Beer findBeerById(Long id);
    List<Beer> findAllBeer();
}
