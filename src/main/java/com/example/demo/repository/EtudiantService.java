package com.example.demo.repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.Exeption.EtudiantExeption;
import com.example.demo.entities.Etudiant;

@Service
public class EtudiantService {
    @Autowired
    private EtudaintRepository EtudaintRepository; 
    public List<Etudiant> list() {
        return EtudaintRepository.findAll();

    }
    public Etudiant get(Long id) {

        Optional<Etudiant> etudiant = EtudaintRepository.findById(id);
        if (etudiant.isPresent())
            return etudiant.get();
        else
            throw new EtudiantExeption(HttpStatus.CONFLICT, "Etudaint existe pas");
       
    }

    public Etudiant create(Etudiant etudiant) {
        if(Objects.isNull(etudiant)){
            throw new EtudiantExeption(HttpStatus.CONFLICT, "etudiant ne peut etre null");
        } else
        return EtudaintRepository.save(etudiant); 

    }
    public Etudiant update(Long id, Etudiant etudiant) {
        throw new EtudiantExeption(HttpStatus.ACCEPTED, "Unimplemented method 'get'");

    }
    public Etudiant delete(Long id) {
        throw new EtudiantExeption(HttpStatus.ACCEPTED, "Unimplemented method 'get'");

    }

}
