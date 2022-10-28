package com.mahdi.repositories;

import com.mahdi.entities.Proj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjRepository extends JpaRepository<Proj, Integer>, JpaSpecificationExecutor<Proj> {

}