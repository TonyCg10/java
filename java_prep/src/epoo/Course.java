package epoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Course {

    private List<Student> students;

    private String name;
    private int capacity;

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        students = new ArrayList<Student>(capacity);
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student e) {

        if (capacity < students.size()) {

            students.add(e);
        } else {
            System.out.println("LLeno");
        }
    }

    public List<Student> bestFive() {

        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return Math.round((float) o1.getMarks() - (float) o2.getMarks());
            }

        });

        List<Student> lista = new ArrayList<Student>();
        for (int i = lista.size() - 1; i >= lista.size() - 5; i--) {

            lista.get(i);
        }

        return lista;
    }

    public List<Student> fail() {

        List<Student> lista = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            Student e = students.get(i);
            if (e.getMarks() < 60)
                lista.add(e);
        }
        return lista;
    }

    public double averageScore() {

        double promedioNotas = 0;

        for (Student e : students) {
            promedioNotas += e.getMarks();
        }
        return promedioNotas / students.size();
    }

    public List<Student> specialAtencion() {

        List<Student> lista = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            Student e = students.get(i);
            if (e.getMarks() < 70)
                lista.add(e);
        }
        return lista;
    }
}