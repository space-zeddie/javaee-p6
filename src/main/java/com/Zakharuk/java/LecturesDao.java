package com.Zakharuk.java;

/**
 * Created by matvii on 08.03.17.
 */
public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);

}