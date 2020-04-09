package pl.haladyj.beercatalogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.haladyj.beercatalogservice.model.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
