package epoo;

public class Student {

    private String name;
    private String lasName;
    private int age;
    private String sex;
    private double marks;

    public Student(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lasName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getLasName() {
        return lasName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getMarks() {
        return marks;
    }

    public void setNotas(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "name: " + name + " " + "lastName: " + lasName + "age: " + age + " " + "sex: " + sex + " " + "marks: "
                + marks;
    }
}