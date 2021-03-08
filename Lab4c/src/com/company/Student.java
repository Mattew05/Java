package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private int score;
    private ArrayList<School> schoolList ;

    //getters

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<School> getSchoolList() {
        return schoolList;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSchoolList(ArrayList<School> schoolList) {
        this.schoolList = schoolList;
    }

    //constructors

    public Student() {
        schoolList = new ArrayList<School>();
        name="generic";
        score=0;
    }

    public Student(String name) {
        schoolList = new ArrayList<School>();
        this.name = name;
        score=0;
    }

    public Student(String name, int score, ArrayList<School> schoolList) {
        schoolList = new ArrayList<School>();
        this.name = name;
        this.score = score;
        this.schoolList = schoolList;
    }

    //tostring

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", schoolList=" + schoolList +
                '}';
    }

    //comparable

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.name);
    }
}
