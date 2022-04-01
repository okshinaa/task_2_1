package ru.vsu.cs.okshina_v_a;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	Student student = new Student("Валерия", "Окшина",4 );
    //student.addSubjects(1,"математика");
    student.addMark(1, "математика", 5);
        System.out.println(student.findAverageMarkForAll());
        System.out.println(student.findAverageMarkForSemester(1, "математика"));

    }
}
