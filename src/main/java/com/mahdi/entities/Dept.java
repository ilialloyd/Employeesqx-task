package com.mahdi.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "dept")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Department's identification number
     */
    @Id
    @Column(name = "DEPTNO", nullable = false)
    private Integer deptno;

    /**
     * Name of the current department
     */
    @Column(name = "DNAME", nullable = false)
    private String dname;

    /**
     * Location of the current department
     */
    @Column(name = "LOC", nullable = false)
    private String loc;

}
