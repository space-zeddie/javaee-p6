package com.Zakharuk.java;

/**
 * Created by matvii on 21.03.17.
 */
public interface ProfessorDao {
    Professor addProfessor(Professor professor);

    Professor getProfessor(int id);

    void saveProfessor(Professor professor);
}
