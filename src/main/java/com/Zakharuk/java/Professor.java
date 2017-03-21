package com.Zakharuk.java;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matvii on 21.03.17.
 */
@Entity
@Table(name="Professors")
public class Professor {

    @Id
    @GeneratedValue
    @Column(name = "professor_id")
    private int professorId;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="cell_phone")
    private String cellphone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "prof_lec",
            joinColumns = @JoinColumn(name = "lecture_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private List<Lecture> lectures;

    @OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "dean_id")
    @PrimaryKeyJoinColumn
    private Professor dean;

    public Professor(String firstName, String lastName, String cellphone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Professor getDean() {
        return dean;
    }

    public void setDean(Professor dean) {
        this.dean = dean;
    }

    public Professor() {
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        String response = "Teacher{" +
                "teacherId=" + professorId +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", faculty=" + faculty +
                ", lectures=[";
        for( Lecture lect : lectures)
            response+=lect.getName()+", ";
        response+="]};";
        return response;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }
}
