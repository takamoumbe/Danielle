package com.project.test.demo.services;

import java.util.*;
import com.project.test.demo.entities.User;
import com.project.test.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    //-- 1 enregistrer un utilisateur
    public void save_user(User user){
        userRepository.save(user);
    }

    //-- 2 supprimer un utilisateur
    public void delete_user(User user){
        userRepository.delete(user);
    }
    //-- 3 selectionner tout les utilisateur
    public List<User> getAllUser(){
        List<User> liste = userRepository.findAll();
        return liste;
    }
    //-- 4 selectionner les utilisateurs employes ou le boss
    /*public List<User> getAllTypeUser(String type){
        List<User> liste = userRepository.findByType(type);
        return  liste;
    }*/
    //-- 5 selectionner un seule utilisateur
    public User getOneUser(int id){
        User user = userRepository.findById(id).get();
        return user;
    }
    //-- 6 selectionner tout les utilisateurs ayant pas les autorisations ou pas
    /*public List<User> getAllUserAuth(String status){
        List<User> user = userRepository.findByStatusUser(status);
        return user;
    }*/

    //-- 9 authentification d'un user
}
