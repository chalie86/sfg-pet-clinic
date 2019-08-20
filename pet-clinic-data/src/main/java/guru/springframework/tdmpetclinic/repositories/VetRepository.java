package guru.springframework.tdmpetclinic.repositories;

import guru.springframework.tdmpetclinic.module.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
