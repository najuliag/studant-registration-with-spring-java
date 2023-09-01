package com.example.studantregistration.Controllers;

import com.example.studantregistration.Model.Studant;
import com.example.studantregistration.Services.StudantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studant")
public class StudantController {

    @Autowired
    private StudantService service;

    @GetMapping
    public List<Studant> findAll(){
        return service.findAll();
    }
    @GetMapping(value = "/{id}")
    public Studant findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }
    @PostMapping
    public Studant create(@RequestBody Studant studant){
        return service.create(studant);
    }
    @PutMapping
    public Studant update(@RequestBody Studant studant){
        return service.update(studant);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
