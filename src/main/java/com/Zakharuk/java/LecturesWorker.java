package com.Zakharuk.java;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by matvii on 08.03.17.
 */
public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}