package guru.springframework.tdmpetclinic.services;

import guru.springframework.tdmpetclinic.module.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String Lastname);
    Owner findById(long id);
    Owner Save(Owner owner);
    Set<Owner> findAll();

}
