package com.mahdi.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "EMPNO", nullable = false)
    private Integer empno;

    @Column(name = "ENAME", nullable = false)
    private String ename;

    @Column(name = "JOB", nullable = false)
    private String job;

    @Column(name = "MGR")
    private Integer mgr;

    @Column(name = "HIREDATE", nullable = false)
    private Date hiredate;

    @Column(name = "SAL", nullable = false)
    private Integer sal;

    @Column(name = "COMM")
    private Integer comm;

    @Column(name = "DEPTNO", nullable = false)
    private Integer deptno;
    @Transient
    /**
     * list of subs
     */
    public List<Emp> subordinates;

}
