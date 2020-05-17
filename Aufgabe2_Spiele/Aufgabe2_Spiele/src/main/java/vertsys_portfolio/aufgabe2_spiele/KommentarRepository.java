package vertsys_portfolio.aufgabe2_spiele;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Spring Data Repository für die Kommentar-Entität.
 */
 @RepositoryRestResource(collectionResourceRel = "kommentar", path = "kommentar")
public interface KommentarRepository extends PagingAndSortingRepository<Kommentar, Long> {

}