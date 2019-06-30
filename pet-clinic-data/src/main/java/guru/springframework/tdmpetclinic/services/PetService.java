package guru.springframework.tdmpetclinic.services;

import guru.springframework.tdmpetclinic.module.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);
    Pet Save(Pet pet);
    Set<Pet> findAll();

}
