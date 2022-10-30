package com.mahdi.repositories;

import com.mahdi.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface EmpRepository extends JpaRepository<Emp, Integer> {

    public List<Emp> findByManagerId(Integer id);

    public Optional<Emp> findByEmpNo(int empNo);

    public Emp deleteByEmpNo(int empNo);
}