package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i) )
                .toArray(Student[]::new);
        var schools = IntStream.rangeClosed(0,2)
                .mapToObj(i->new School("H"+i))
                .toArray(School[]::new);

        schools[0].setCapacity(1);
        schools[1].setCapacity(2);
        schools[2].setCapacity(2);

        List<Student> studentList = new LinkedList<Student>();
        Collections.sort(studentList);

        TreeSet<School> schoolList = new TreeSet<School>();
        for(School s: schools )schoolList.add(s);

        Map<Student, List<School>> stdPrefMap = new HashMap<>();
        List<School> prefList = new ArrayList<>();
        prefList.add(schools[0]);
        prefList.add(schools[1]);
        prefList.add(schools[2]);

        stdPrefMap.put(students[0], prefList);

        Map<School, List<Student>> schPrefMap = new TreeMap<>();
        schPrefMap.put(schools[0], Arrays.asList(students[0], students[1], students[2], students[3]));

    }
}
