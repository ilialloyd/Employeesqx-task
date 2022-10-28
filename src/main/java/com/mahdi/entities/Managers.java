package com.mahdi.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "managers")
public class Managers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    @Column(name = "Manager")
    private String manager;

    @Column(name = "Employee", nullable = false)
    private String employee;

}
