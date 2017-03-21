package com.Zakharuk.java;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by matvii on 21.03.17.
 */
@Repository
@Transactional
public class ProfessorDaoJPAImpl implements ProfessorDao {
    @PersistenceContext
    private EntityManager em;

    public Professor addProfessor(Professor professor) {
        em.persist(professor);
        return professor;
    }

    public Professor getProfessor(int id) {
        return em.find(Professor.class,id);
    }

    public void saveProfessor(Professor professor) {
        em.merge(professor);
    }
}
