package com.project.test.demo.services;

import com.project.test.demo.entities.Filiere;
import com.project.test.demo.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereService {

    @Autowired
    private FiliereRepository filiereRepository;

    //-- 1 liste des filieres
    public List<Filiere> getAllFiliere(){
        List filieres = filiereRepository.findAll();
        return filieres;
    }


    //-- 2 selectionner une seule filiere
    public Filiere getOneFiliere(int id_filiere){
        Filiere filiere = filiereRepository.findById(id_filiere).get();
        return filiere;
    }

    //-- 3 enregistrer une filiere
    public void save_filiere(Filiere filiere){
        filiereRepository.save(filiere);
    }

    //-- 4 supprimer une filiere
    public void delete_filiere(Filiere filiere){
        filiereRepository.delete(filiere);
    }


}
