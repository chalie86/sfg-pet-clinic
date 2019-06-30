package guru.springframework.tdmpetclinic.services;

import guru.springframework.tdmpetclinic.module.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(long id);
    Vet Save(Vet vet);
    Set<Vet> findAll();

}
