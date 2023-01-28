package com.project.test.demo.controller;

import com.project.test.demo.entities.Filiere;
import com.project.test.demo.services.FiliereService;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("filiere")
public class FiliereControl {

    @Autowired
    private FiliereService filiereService;
    @Autowired
    private ModelMapper modelMapper;


}
