package com.mahdi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Emp  {

    @Id
    @Column(name = "EMPNO", nullable = false)
    private int empNo;

    @Column(name = "ENAME", nullable = false)
    private String eName;

    @Column(name = "JOB", nullable = false)
    private String job;

    @Column(name = "MGR")
    private Integer managerId;

    @Column(name = "HIREDATE", nullable = false)
    private Date hireDate;

    @Column(name = "SAL", nullable = false)
    private int sal;

    @Column(name = "COMM")
    private Integer comm;

    @Column(name = "DEPTNO", nullable = false)
    private int deptNo;


}
