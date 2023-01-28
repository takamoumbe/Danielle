package com.project.test.demo.repository;

import com.project.test.demo.entities.Documents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentsRepository extends JpaRepository<Documents, Integer> {

    //-- selectionner tous les documents enregistrer par un user
    @Query(value="SELECT * FROM documents WHERE id_user=:any", nativeQuery = true)
    public List<Documents> findByUser(@Param("any") Integer id);

}
