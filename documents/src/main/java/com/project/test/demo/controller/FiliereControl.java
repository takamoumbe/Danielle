package com.project.test.demo.controller;

import com.project.test.demo.entities.Filiere;
import com.project.test.demo.services.FiliereService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("filiere")
public class FiliereControl {

    @Autowired
    private FiliereService service;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/all")
    public ResponseEntity<List<Filiere>> getAllFiliere(){
        List<Filiere> listed = service.getAllFiliere();

        if (listed.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        try{
            return new ResponseEntity<>(listed, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Filiere> getOneFiliere(@PathVariable int id){
        Filiere filiere = service.getOneFiliere(id);

        if (filiere != null){
            return new ResponseEntity<>(filiere, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/create")
    public  ResponseEntity<List<Filiere>> createFiliere(@RequestBody Filiere entity){
        try{
            service.save_filiere(entity);

            if (entity != null){
                List<Filiere> liste = service.getAllFiliere();
                return new ResponseEntity<>(liste, HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<List<Filiere>> updateFiliere(@PathVariable int id, @RequestBody Filiere entity){
        Filiere filiere = service.getOneFiliere(id);
        if (filiere != null){
            filiere = entity;
            filiere.setId_filiere(id);
            service.save_filiere(filiere);
            List<Filiere> list = service.getAllFiliere();
            return new ResponseEntity<>(list, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
