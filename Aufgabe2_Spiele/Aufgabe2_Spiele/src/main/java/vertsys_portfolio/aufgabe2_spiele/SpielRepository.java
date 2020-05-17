package vertsys_portfolio.aufgabe2_spiele;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Spring Data Repository für die Spiel-Entität.
 */
 @RepositoryRestResource(collectionResourceRel = "spiel", path = "spiel")
public interface SpielRepository extends PagingAndSortingRepository<Spiel_, Long> {


}