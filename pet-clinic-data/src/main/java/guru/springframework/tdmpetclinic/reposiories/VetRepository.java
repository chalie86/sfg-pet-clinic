package guru.springframework.tdmpetclinic.reposiories;

import guru.springframework.tdmpetclinic.module.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
