package com.example.demorailway;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RestControllerEstudiante {

    @Autowired
    private RepositoryEstudiante repo;
    
    @GetMapping("/estudiante/{id}")
    public Estudiante consultarPorId(@PathVariable(name = "id") int id) {
        return repo.findById(id).get(); 
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> listarTodos() {
        return repo.findAll();
    }
}