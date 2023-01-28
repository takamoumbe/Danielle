package com.project.test.demo.services;

import com.project.test.demo.entities.Niveau;
import com.project.test.demo.repository.NiveauRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NiveauService {

    private NiveauRepository niveauRepository;

    //-- 1 enregistrer un niveau
    public void save_niveau(Niveau niveau){
        niveauRepository.save(niveau);
    }

    //-- 2 supprimer un niveau
    public void delete_niveau(Niveau niveau){
        niveauRepository.delete(niveau);
    }

    //-- 3 selectionner tout les niveaux
    public List<Niveau> getAllNiveau(){
        List<Niveau> liste = niveauRepository.findAll();
        return liste;
    }

    //-- 4 selectionner un seule niveau
    public Niveau getOneNiveau(int id){
        Niveau niveau = niveauRepository.findById(id).get();
        return niveau;
    }
}
