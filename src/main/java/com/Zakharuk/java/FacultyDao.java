package com.Zakharuk.java;

/**
 * Created by matvii on 21.03.17.
 */
public interface FacultyDao {

    Faculty addFaculty(Faculty faculty);

    Faculty getFaculty(int id);

    void saveFaculty(Faculty faculty);

}
