package guru.springframework.tdmpetclinic.reposiories;

import guru.springframework.tdmpetclinic.module.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
