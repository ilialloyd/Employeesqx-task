package com.mahdi.services;

import com.mahdi.entities.Emp;
import com.mahdi.repositories.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpService implements IEmpServ {

    @Autowired
    private EmpRepository empRep;
    /**
     * stores (id, employee) pair
     */
    private Map<Integer, Emp> employees = new HashMap<>();
    private Emp root;

    public Emp getRoot() {
        return root;
    }

    public List<Emp> getAllemp(){
        return empRep.findAll();
    }


    /**
     * Read data and build map of employees
     */
    public void readDataAndCreateMap()  {
        List<Emp> allEmployees = new ArrayList();
        allEmployees= empRep.findAll();
            for (Emp x:allEmployees) {
                employees.put(x.getEmpno(),x);
                if (x.getMgr()==null){
                    root=x;
                        }
        }
    }

    /**
     * Build tree
     * @param root the employee without a manager in this case the 'king'
     */
    public void buildHierarchyTree(Emp root) {
        Emp employee = root;
        List<Emp> subs = getSubsById(employee.getEmpno());
        employee.subordinates = subs;
        if (subs.size() == 0)
            return;
        for (Emp em : subs)
            buildHierarchyTree(em);
    }

    /**
     *
     * @param managerId
     * @return retrive subordinates list by given id
     */
    private List<Emp> getSubsById(int managerId) {
        List<Emp> subs = new ArrayList<>();
        for (Emp em : employees.values()) {
            if ((em.getMgr() != null) && (em.getMgr() == managerId))
                subs.add(em);
        }
        return subs;
    }


    //Print tree, Recursion, Time O(n), Space O(h)

    /**
     * print the tree with recursion
     * @param root
     * @param level
     */
    public void printHierarchyTree(Emp root, int level) {
        for (int i = 0; i < level; i++)
            System.out.print("\t");
        System.out.println(root.getEname());

        List<Emp> subs = root.subordinates;
        for (Emp em : subs)
            printHierarchyTree(em, level+1);
    }
}
