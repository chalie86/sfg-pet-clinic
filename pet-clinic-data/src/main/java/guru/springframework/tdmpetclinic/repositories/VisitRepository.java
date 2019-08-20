package guru.springframework.tdmpetclinic.repositories;

import guru.springframework.tdmpetclinic.module.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
