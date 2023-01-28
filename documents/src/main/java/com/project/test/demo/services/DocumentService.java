package com.project.test.demo.services;

import com.project.test.demo.entities.Filiere;
import com.project.test.demo.repository.DocumentsRepository;
import com.project.test.demo.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;
import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentsRepository documentsRepository;

    // afficher tout les documents
    public List<Document> getAllDocuments(){
        List documents = documentsRepository.findAll();
        return documents;
    }

    // afficher un documents
    public Document getDocument(int id_document){
        Document document = (Document) documentsRepository.findById(id_document).get();
        return document;
    }

    //inserer un document


}
