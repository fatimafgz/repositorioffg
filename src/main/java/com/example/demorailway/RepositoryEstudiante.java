package com.example.demorailway;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEstudiante extends JpaRepository<Estudiante, Integer> {

}

