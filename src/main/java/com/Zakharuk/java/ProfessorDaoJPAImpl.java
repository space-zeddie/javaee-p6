package com.Zakharuk.java;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    public List<Professor> listAllProfessors() {
        TypedQuery<Professor> query = em.createQuery("SELECT c FROM Professor c", Professor.class);
        List<Professor> professors = query.getResultList();
        //for (Professor prof : professors)
            //System.out.println(prof);
        return professors;
    }

    public List<Professor> findByName(String name) {
        TypedQuery<Professor> query = em.createQuery("SELECT c FROM Professor c where c.firstName = :fname", Professor.class);
        query.setParameter("fname", name);
        List<Professor> professors = query.getResultList();
        return professors;
    }
}
