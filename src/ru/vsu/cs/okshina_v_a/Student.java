package ru.vsu.cs.okshina_v_a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    public final String name;
    public final String lastname;
    public final int group;

    public HashMap<Integer, List<String>> subjects;
    public HashMap<String,List<Integer>> marks;

    public Student(String name,String lastname,int group) {
        this.name = name;
        this.lastname = lastname;
        this.group = group;

        this.subjects = new HashMap<>();
        this.marks = new HashMap<>();
    }

   public void addSubjects(Integer sem, String subject) {
       if (subjects.get(sem) == null) {
           List<String> listSub = new ArrayList<>();
           listSub.add(subject);
           subjects.put(sem, listSub);
           return;
       }

       subjects.get(sem).add(subject);
   }

    public void addMark(Integer sem, String subject, Integer mark) {
        if (marks.get(subject).get(sem) == null) {
            List<Integer> listMarks = new ArrayList<>();
            listMarks.add(mark);
            marks.put(subject, listMarks);
            return;
        }

        marks.get(subject).add(mark);
    }

    public double findAverageMarkForSemester(Integer sem, String subject) {
        double sum = 0;
        int count = 0;

        for (String s:subjects.get(sem)) {

            for ( int i :marks.get(subject)) {
                sum += i;
            }

            count += marks.get(subject).size();
        }

        return sum/count;
    }

    public double findAverageMarkForAll() {
        double sum = 0;
        double count = 0;

        for (List<Integer> list:marks.values()) {

            for (int i:list) {
                sum  += i;
            }

            count = list.size();
        }

        return sum/count;
    }
}
