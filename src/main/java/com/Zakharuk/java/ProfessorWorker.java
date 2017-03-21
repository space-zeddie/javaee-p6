package com.Zakharuk.java;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.PersistenceContext;
import java.util.List;

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

    public List<Professor> listAll() {
        return professorDao.listAllProfessors();
    }

    public List<Professor> findByName(String name) {
        return professorDao.findByName(name);
    }
}
