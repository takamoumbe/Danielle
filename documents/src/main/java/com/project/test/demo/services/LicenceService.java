package com.project.test.demo.services;

import com.project.test.demo.entities.Licence;
import com.project.test.demo.repository.LicenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenceService {
    private LicenceRepository licenceRepository;

    //-- 1 enregistrer une licence
    public void save_licence(Licence licence){
        licenceRepository.save(licence);
    }

    //-- 2 supprimer une licence
    public void delete_licence(Licence licence){
        licenceRepository.delete(licence);
    }

    //-- 3 liste des licences
    public List<Licence> getAllLicence(){
        List<Licence> liste = licenceRepository.findAll();
        return liste;
    }

    //-- 4 selectionner une seule licence
    public Licence getOneLicence(int id){
        Licence licence = licenceRepository.findById(id).get();
        return licence;
    }
}
