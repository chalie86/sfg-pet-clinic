package guru.springframework.tdmpetclinic.reposiories;

import guru.springframework.tdmpetclinic.module.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
