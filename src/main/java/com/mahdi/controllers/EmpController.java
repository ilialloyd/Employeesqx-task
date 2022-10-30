package com.mahdi.controllers;

import com.mahdi.entities.Emp;
import com.mahdi.repositories.EmpRepository;
import com.mahdi.services.IEmpServ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpController {


    @Autowired
    private IEmpServ employeeService;

    //find employees that works for specific manager
    @GetMapping("/employeesBy/{managerNo}")
    public List<Emp> findEmployeesByTheirManager(@PathVariable Integer managerNo) {
        List<Emp> list = employeeService.getEmpByManager(managerNo);
        return list;
    }

    //print all
    @GetMapping("/employees")
    public List<Emp> findAll() {
        return employeeService.getEmployees();
    }

    //find by Emp no
    @GetMapping("/employees/{no}")
    public Emp getEmployee(@PathVariable int no) {

        return employeeService.getEmployeeByEmpNo(no);
    }


    //update
    @PutMapping("/employees/{empNo}")
    public ResponseEntity<Emp> updateEmployee(@PathVariable Integer empNo, @RequestBody Emp employee) {
        System.out.println("epdating the employee data for the employee no :"+empNo);
        Emp getEmp = employeeService.getEmployeeByEmpNo(empNo);
//        getEmp.setEmpNo(employee.getEmpNo());
        getEmp.setEName(employee.getEName());
        getEmp.setJob(employee.getJob());
//        getEmp.setManagerId(employee.getManagerId());
//        getEmp.setHireDate(employee.getHireDate());
//        getEmp.setSal(employee.getSal());
//        getEmp.setComm(employee.getComm());
//        getEmp.setDeptNo(employee.getDeptNo());

        Emp uptEmp =employeeService.saveEmp(getEmp);
        return ResponseEntity.ok().body(uptEmp);
    }



    //save  employee
    @PostMapping("/employees") //or change to save
    public Emp save(@RequestBody Emp emp) {
        return employeeService.saveEmp(emp);

    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable(value = "id", required = true) int id) {
        Emp emp = employeeService.getEmployeeByEmpNo(id);
        if (emp == null) {
            throw new RuntimeException("Employee id not found - " + id);
        }
        employeeService.deleteEmployee(emp);
        return "Record Deleted";
    }
}



