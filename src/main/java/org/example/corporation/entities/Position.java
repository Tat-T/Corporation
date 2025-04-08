package org.example.corporation.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(nullable = false, unique = true)
    private  String title;

    private Double salary;

    @OneToMany(mappedBy = "position")
    private List<Employee> employees;

}
