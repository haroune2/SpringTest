package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Etudiant;
import com.example.demo.repository.EtudiantService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class EtudiantController {

    private static final Logger log = LoggerFactory.getLogger(EtudiantController.class);

    @Autowired
    private EtudiantService EtudiantService;
    /*
     * CRUD
     * C >> CREATE
     * R >> READ
     * U >> UPDATE
     * D >> DELETE
     */

    // READ >> list
    @GetMapping("")
    public List<Etudiant> List() {
        
        return EtudiantService.list();

    }

    // get one
    @GetMapping("/{id}")
    public Etudiant get(@PathVariable Long id) {
        return EtudiantService.get(id);

    }

    // CREATE
    @PostMapping("/create")
    public Etudiant create(@RequestBody Etudiant etudiant) {
        return EtudiantService.create(etudiant);
    }

    // U >> UPDATE
    @PutMapping("/{id}")
    public Etudiant update(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        return EtudiantService.update(id, etudiant);
    }

    // D >> DELETE
    @DeleteMapping("/{id}")
    public Etudiant delete(@PathVariable Long id) {

        return EtudiantService.delete(id);
    }

}
