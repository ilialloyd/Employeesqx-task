package com.mahdi.services;

import com.mahdi.entities.Emp;
import com.mahdi.repositories.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class EmpService implements IEmpServ {
@Autowired

private EmpRepository empRepository;
    @Override
    public List<Emp> getEmployees() {
        return empRepository.findAll();
    }

    @Override
    public List<Emp>  getEmpByManager(Integer managerNo) {
        List<Emp> list = empRepository.findByManagerId(managerNo);
        return list;
    }



    @Override
    public void deleteEmployee(Emp emp) {
        empRepository.delete(emp);
    }

    @Override
    public Emp getEmployeeByEmpNo(int empNo) {
        Optional<Emp> emp = empRepository.findByEmpNo(empNo);

        if (emp.isPresent()) {
            return emp.get();
        }

      throw new RuntimeException("Employee id is not found: "+empNo);

    }

    @Override
    public Emp saveEmp(Emp emp) {
        return empRepository.save(emp);
    }
}
