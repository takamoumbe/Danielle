package com.project.test.demo.repository;

import com.project.test.demo.entities.Documents;
import com.project.test.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    //---- findBy
    public List<User> findByType(String type);

    public List<User> findByStatusUser(String status);

}
