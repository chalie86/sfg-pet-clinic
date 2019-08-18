package guru.springframework.tdmpetclinic.reposiories;

import guru.springframework.tdmpetclinic.module.Owner;
import guru.springframework.tdmpetclinic.module.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
