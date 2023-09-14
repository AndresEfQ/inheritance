package entities;

import enums.Course;
import enums.MaritalStatus;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> courses;

    public Student() {
        courses = new ArrayList<>();
    }

    public Student(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, ArrayList<Course> courses) {
        super(firstName, lastName, idNumber, maritalStatus);
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses + '\'' +
                '}';
    }
}
