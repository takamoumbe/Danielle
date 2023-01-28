package com.project.test.demo.repository;

import com.project.test.demo.entities.Licence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenceRepository extends JpaRepository<Licence, Integer> {
}
