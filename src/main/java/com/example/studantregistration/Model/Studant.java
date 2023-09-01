package com.example.studantregistration.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "studant")
public class Studant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "studant_name", nullable = false, length = 80)
    private String name;

    @Column(name = "studant_age", nullable = false, length = 2)
    private String age;

    @Column
    private boolean present;

    public Studant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
