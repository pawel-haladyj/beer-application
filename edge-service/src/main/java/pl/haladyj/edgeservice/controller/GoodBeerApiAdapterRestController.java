package pl.haladyj.edgeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.haladyj.edgeservice.client.BeerClient;
import pl.haladyj.edgeservice.model.Beer;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/client")
public class GoodBeerApiAdapterRestController {

    private final BeerClient client;

    public GoodBeerApiAdapterRestController(BeerClient client) {
        this.client = client;
    }

    @GetMapping("/good-beers")
    public List<Beer> getGoodBeers(){
        return client.getAllBeer()
                .stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    @GetMapping("/beer/{id}")
    public Beer getBeerById(@PathVariable("id") Long id){
        return client.getBeerById(id);
    }

    private boolean isGreat(Beer beer) {
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coors Light") &&
                !beer.getName().equals("PBR");
    }
}
