package pl.haladyj.beercatalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.haladyj.beercatalogservice.model.Beer;
import pl.haladyj.beercatalogservice.service.implementation.BeerServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BeerController {

    private final BeerServiceImpl service;

    public BeerController(BeerServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/beer/{id}")
    public Beer getBeerById(@PathVariable("id") Long id){
        return service.findBeerById(id);
    }

    @GetMapping("/beers")
    public List<Beer> getAllBeer(){
        return service.findAllBeer();
    }
}
