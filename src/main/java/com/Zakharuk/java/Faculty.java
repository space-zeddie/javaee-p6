package com.Zakharuk.java;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matvii on 21.03.17.
 */
@Entity
@Cacheable(true)
@Table(name="Faculties")
public class Faculty {

    @Id
    @GeneratedValue
    @Column(name = "faculty_id")
    private int facutlyId;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "faculty", orphanRemoval = true)
    private List<Professor> professors;

    public Faculty(){}

    public Faculty(String name) {
        this.name = name;
    }

    public int getFacutlyId() {
        return facutlyId;
    }

    public void setFacutlyId(int facutlyId) {
        this.facutlyId = facutlyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facutlyId=" + facutlyId +
                ", name='" + name + '}';
    }
}
