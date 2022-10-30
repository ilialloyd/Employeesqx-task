package com.mahdi.services;

import com.mahdi.entities.Emp;

import java.util.List;

public interface IEmpServ {
    List<Emp> getEmployees();

    List<Emp> getEmpByManager(Integer mabagerNo);

    public void deleteEmployee(Emp emp);

    Emp getEmployeeByEmpNo(int empNo);

    Emp saveEmp(Emp emp);
}
