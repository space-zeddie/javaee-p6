package com.Zakharuk.java;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
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
        Query query = em.createNamedQuery(Professor.FIND_ALL, Professor.class);
        List<Professor> professors = query.getResultList();
        return professors;
    }

    public List<Professor> findByName(String name) {
        Query query = em.createNamedQuery(Professor.FIND_WITH_PARAM, Professor.class);
        query.setParameter("fname", name);
        query.setMaxResults(10);
        List<Professor> professors = query.getResultList();
        return professors;
    }

    public void changeName(int id, String newName) {
        TypedQuery<Professor> query = em.createQuery("SELECT c from Professor c", Professor.class);

    }
}
