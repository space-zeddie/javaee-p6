package com.Zakharuk.java;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by matvii on 21.03.17.
 */
public class FacultyWorker {

    @Autowired
    FacultyDao facultyDao;

    public Faculty addFaculty(Faculty faculty){
        faculty = facultyDao.addFaculty(faculty);
        System.out.println(faculty);
        return faculty;
    }
}
