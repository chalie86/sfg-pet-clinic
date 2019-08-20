package guru.springframework.tdmpetclinic.repositories;

import guru.springframework.tdmpetclinic.module.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
