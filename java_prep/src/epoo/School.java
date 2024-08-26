package epoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {

    private List<Course> courseList = new ArrayList<Course>(3);

    private String name;
    private String[] courses = { "Decimo", "Onceno", "Doceno" };

    public School(String name) {
        this.name = name;
        courseList.add(new Course("Decimo", 10));
        courseList.add(new Course("Onceno", 13));
        courseList.add(new Course("Doceno", 12));
    }

    public void matricular(String nameCourse, Student e) {

        for (Course course : courseList) {
            if (course.getName().equalsIgnoreCase(nameCourse)) {
                course.addStudent(e);
            }
        }

    }

    @Override
    public String toString() {
        return "School [courses = " + Arrays.toString(courses) + ", name = " + name + "]";
    }

}