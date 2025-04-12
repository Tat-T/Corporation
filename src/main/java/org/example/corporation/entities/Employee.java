package org.example.corporation.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table( name = "employess")

public class Employee {

    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private  int id;

    @Column(name = "username", nullable = false)
    private String userName;

    @Column(nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @CreationTimestamp
    private Instant createdOn;

    @UpdateTimestamp
    private  Instant lastUpdatedOn;

    public Employee (String userName, int age){
        this.userName = userName;
        this.age = age;
    }

    public Employee() {}

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
