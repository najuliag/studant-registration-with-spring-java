package com.example.studantregistration.Services;

import com.example.studantregistration.Exception.ResourceNotFoundException;
import com.example.studantregistration.Model.Studant;
import com.example.studantregistration.Repositories.StudantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudantService {

    @Autowired
    StudantRepository repository;

    public Studant findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found!"));
    }

    public List<Studant> findAll(){
        List<Studant> studants = new ArrayList<>();
        return repository.findAll();
    }

    public Studant create(Studant studant){
        return repository.save(studant);
    }

    public Studant update(Studant studant){
        Studant entity = repository.findById(studant.getId()).orElseThrow(() -> new ResourceNotFoundException("Not records found for this id"));

        entity.setName(studant.getName());
        entity.setAge(studant.getAge());
        entity.setPresent(studant.isPresent());
        return repository.save(studant);
    }

    public void delete(Long id){
        Studant entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id."));
    }
}
