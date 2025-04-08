package org.example.corporation.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private  String name;

    private String description;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
