package com.example.studantregistration.Repositories;

import com.example.studantregistration.Modal.Studant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudantRepository extends JpaRepository<Studant, Long> {
}
