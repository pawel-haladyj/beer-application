package pl.haladyj.beercatalogservice.service.implementation;

import org.springframework.stereotype.Service;
import pl.haladyj.beercatalogservice.model.Beer;
import pl.haladyj.beercatalogservice.repository.BeerRepository;
import pl.haladyj.beercatalogservice.service.BeerService;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository repository;

    public BeerServiceImpl(BeerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Beer findBeerById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Beer> findAllBeer() {
        return repository.findAll();
    }
}
