package com.dt2.petmania.Service;


import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class PetService {
    private final PetRepository repository;


    public PetService(PetRepository repository) {
        this.repository = repository;
    }


    public List<Pet> mostrarPet(){
        List<Pet> petList = new ArrayList<>();
        petList = repository.findAll();
        return petList;
    }


    public void cadastrarPet (Pet a){
        Pet pet = new Pet(a.getNome() , a.getEspecie(), a.getRaca(), a.getIdade() , a.getSexo() , a.getPorte() , a.getPersonalidade() , a.getFoto() , a.isDisponivel());
        repository.save(pet);
    }


}