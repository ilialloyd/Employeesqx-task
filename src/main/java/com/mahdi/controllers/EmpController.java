package com.mahdi.controllers;

import com.mahdi.entities.Emp;
import com.mahdi.services.EmpService;
import com.mahdi.services.IEmpServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmpService empServ;
    // fixme affichage au niveau de console pas dans le postman
    @GetMapping("/all")
    public void findAllEmployye1(){
        empServ.readDataAndCreateMap();
        empServ.buildHierarchyTree(empServ.getRoot());
        empServ.printHierarchyTree(empServ.getRoot(),0);

    }

 /*   @GetMapping("/last")
    public List<Emp> findAllEmployye2(Emp root, int level){
        List<Emp> res = new ArrayList<>();
        empServ.readDataAndCreateMap();
        empServ.buildHierarchyTree(empServ.getRoot());
        for (int i = 0; i < level; i++)
            System.out.print("\t");
        System.out.println(root.getEname());
        List<Emp> subs = root.subordinates;
        for (Emp em : subs)
                res = findAllEmployye2(em, level + 1);
        return res;
    }*/


    }



