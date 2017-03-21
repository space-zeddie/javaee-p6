package com.Zakharuk.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by matvii on 08.03.17.
 */
public class App {


    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /*Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        List<Lecture> lectureList = new ArrayList<Lecture>();
        lectureList.add(lecture);

        Professor professor = new Professor("Andrii", "Glybovets", "0000");
        professor.setLectures(lectureList);
        Professor dean = new Professor("Mykola", "Glybovets", "0001");
        dean.setLectures(lectureList);
        professor.setDean(dean);
        dean.setDean(dean);

        List<Professor> professorList = new ArrayList<Professor>();
        professorList.add(professor);
        professorList.add(dean);

        Faculty faculty = new Faculty("FI");
        faculty.setProfessors(professorList);

        professor.setFaculty(faculty);
        dean.setFaculty(faculty);*/

        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        ProfessorWorker professorWorker = (ProfessorWorker)context.getBean("workerProf");
        FacultyWorker facultyWorker = (FacultyWorker)context.getBean("workerFaculty");
       /* worker.addLecture(lecture);

        facultyWorker.addFaculty(faculty);
        professorWorker.addProfessor(dean);
        professorWorker.addProfessor(professor);*/

        List<Professor> allprofs = professorWorker.listAll();
        for (Professor p : allprofs)
            System.out.println(p.getProfessorId());

        
    }

}