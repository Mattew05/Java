package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class School implements Comparable<School>{
    private String name;
    private int capacity;
    private ArrayList<Student> studentRank ;

    //getters

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Student> getStudentRank() {
        return studentRank;
    }

    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setStudentRank(ArrayList<Student> studentRank) {
        this.studentRank = studentRank;
    }

    //constructors


    public School() {
        studentRank = new ArrayList<Student>();
    }

    public School(String name) {
        studentRank = new ArrayList<Student>();
        this.name = name;
    }

    public School(String name, int capacity, ArrayList<Student> studentRank) {
        studentRank = new ArrayList<Student>();
        this.name = name;
        this.capacity = capacity;
        this.studentRank = studentRank;
    }

    //tostring

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", studentRank=" + studentRank +
                '}';
    }

    //comparable

    @Override
    public int compareTo(School s) {
        return name.compareTo(s.name);
    }
}
