package com.mahdi.repositories;

import com.mahdi.entities.Managers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagersRepository extends JpaRepository<Managers, Void>, JpaSpecificationExecutor<Managers> {

}