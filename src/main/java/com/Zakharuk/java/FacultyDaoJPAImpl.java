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
public class FacultyDaoJPAImpl implements FacultyDao {
    @PersistenceContext
    private EntityManager em;

    public Faculty addFaculty(Faculty faculty) {
        em.persist(faculty);
        return faculty;
    }

    public Faculty getFaculty(int id) {
        return em.find(Faculty.class,id);
    }

    public void saveFaculty(Faculty faculty) {
        em.merge(faculty);
    }
}
