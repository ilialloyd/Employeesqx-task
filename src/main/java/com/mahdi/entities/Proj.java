package com.mahdi.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "proj")
public class Proj implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "PROJID", nullable = false)
    private int projid;

    @Column(name = "EMPNO", nullable = false)
    private int empno;

    @Column(name = "STARTDATE", nullable = false)
    private Date startdate;

    @Column(name = "ENDDATE", nullable = false)
    private Date enddate;

}
