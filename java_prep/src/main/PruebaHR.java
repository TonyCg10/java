package main;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class PruebaHR {
    class Student {

        int id;
        String name;
        double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return cgpa;
        }

    }

    class Priorities {

        public List<Student> getStudents(List<String> events) {

            PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.comparing(Student::getCGPA)
                    .reversed().thenComparing(Student::getName).thenComparing(Student::getID));

            List<Student> students = new ArrayList<>();
            
            for (String str : events) {

                String[] strM = str.split(" ");
                if (strM[0].equals("ENTER")) {

                    int intParse = Integer.parseInt(strM[3]);
                    double doubleParse = Double.parseDouble(strM[2]);

                    Student student = new Student(intParse, strM[1], doubleParse);
                    priorityQueue.add(student);

                } else if (strM[0].equals("SERVED")) {

                    priorityQueue.poll();
                }
            }

            Student s = priorityQueue.poll();

            while (s != null) {

                students.add(s);
                s = priorityQueue.poll();
            }

            return students;
        }
    }
}
