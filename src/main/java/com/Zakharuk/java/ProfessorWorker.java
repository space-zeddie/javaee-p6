package com.Zakharuk.java;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by matvii on 21.03.17.
 */
public class ProfessorWorker {
    @Autowired
    ProfessorDao professorDao;

    public Professor addProfessor(Professor professor){
        professor = professorDao.addProfessor(professor);
        System.out.println(professor);
        return professor;
    }
}
