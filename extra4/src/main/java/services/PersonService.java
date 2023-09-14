package services;

import entities.*;
import enums.Course;
import enums.Department;
import enums.MaritalStatus;
import enums.Section;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {
    private final Scanner sc;
    private final ArrayList<Person> persons;

    public PersonService() {
        sc = new Scanner(System.in);
        persons = new ArrayList<>();
    }

    private void changeMaritalStatus() {
        System.out.println("Please select the person you want to change the marital status to");
        int counter = 1;
        for (Person person : persons) {
            System.out.println(counter + ". " + person);
            counter++;
        }
        int personOp;
        do {
            personOp = Integer.parseInt(sc.nextLine());
            if (personOp < 1 || personOp > persons.size() + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (personOp < 1 || personOp > persons.size() + 1);

        Person newPerson = persons.remove(personOp);

        System.out.println();
        System.out.println("Pleas choose the new marital status");
        counter = 1;
        for (MaritalStatus maritalStatus : MaritalStatus.values()) {
            System.out.println(counter + ". " + maritalStatus.name());
            counter++;
        }
        int statusOp;
        do {
            statusOp = Integer.parseInt(sc.nextLine());
            if (statusOp < 1 || statusOp > MaritalStatus.values().length + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (statusOp < 1 || statusOp > MaritalStatus.values().length + 1);

        MaritalStatus newMaritalStatus = MaritalStatus.values()[statusOp - 1];

        newPerson.setMaritalStatus(newMaritalStatus);
        persons.add(newPerson);
    }

    private void changeOfficeNumberToEmployee() {
        System.out.println("Please select the employee you want to change the office number to");
        int counter = 1;
        ArrayList<Integer> employeeIndexes = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee) {
                System.out.println(counter + ". " + person);
                employeeIndexes.add(counter - 1);
                counter++;
            }
        }
        int employeeOp;
        do {
            employeeOp = Integer.parseInt(sc.nextLine());
            if (employeeOp < 1 || employeeOp > employeeIndexes.size() + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (employeeOp < 1 || employeeOp > employeeIndexes.size() + 1);

        int personIndex = employeeIndexes.get(employeeOp - 1);
        Employee newEmployee = (Employee) persons.remove(personIndex);

        System.out.println();
        System.out.println("Please choose the new office number");
        int officeNumber = Integer.parseInt(sc.nextLine());

        newEmployee.setOfficeNumber(officeNumber);
        persons.add(newEmployee);
    }

    private void addCourseToStudent() {
        System.out.println("Please select the student you want to add a course to");
        int counter = 1;
        ArrayList<Integer> studentIndexes = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Student) {
                System.out.println(counter + ". " + person);
                studentIndexes.add(counter - 1);
                counter++;
            }
        }
        int studentOp;
        do {
            studentOp = Integer.parseInt(sc.nextLine());
            if (studentOp < 1 || studentOp > studentIndexes.size() + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (studentOp < 1 || studentOp > studentIndexes.size() + 1);

        int personIndex = studentIndexes.get(studentOp - 1);
        Student newStudent = (Student) persons.remove(personIndex);

        System.out.println();
        System.out.println("Please choose the course you want to add");
        counter = 1;
        for (Course course : Course.values()) {
            System.out.println(counter + ". " + course.name());
            counter++;
        }

        int courseOp;
        do {
            courseOp = Integer.parseInt(sc.nextLine());
            if (courseOp < 1 || courseOp > Course.values().length + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (courseOp < 1 || courseOp > Course.values().length + 1);
        Course course = Course.values()[courseOp - 1];
        newStudent.addCourse(course);
        persons.add(newStudent);
    }

    private void changeDepartmentToTeacher() {
        System.out.println("Please choose the teacher you want to change the department to");
        int counter = 1;
        ArrayList<Integer> teacherIndexes = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Teacher) {
                System.out.println(counter + ". " + person);
                teacherIndexes.add(counter - 1);
                counter++;
            }
        }

        int teacherOp;
        do {
            teacherOp = Integer.parseInt(sc.nextLine());
            if (teacherOp < 1 || teacherOp > teacherIndexes.size()) {
                System.out.println("Invalid option, please try again");
            }
        } while (teacherOp < 1 || teacherOp > teacherIndexes.size());

        int teacherIndex = teacherIndexes.get(teacherOp - 1);
        Teacher newTeacher = (Teacher) persons.remove(teacherIndex);

        System.out.println();
        System.out.println("Please choose the new department");
        counter = 1;
        for (Department department : Department.values()) {
            System.out.println(counter + ". " + department.name());
            counter++;
        }

        int departmentOp;
        do {
            departmentOp = Integer.parseInt(sc.nextLine());
            if (departmentOp < 1 || departmentOp > Department.values().length + 1) {
                System.out.println("Invalid option, please choose again");
            }
        } while (departmentOp < 1 || departmentOp > Department.values().length + 1);

        Department department = Department.values()[departmentOp - 1];
        newTeacher.setDepartment(department);
        persons.add(newTeacher);
    }

    private void reassignServicePersonnel() {
        System.out.println("Please choose the service personnel you want to reassign");
        int counter = 1;
        ArrayList<Integer> spIndexes = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof ServicePersonnel) {
                System.out.println(counter + ". " + person);
                spIndexes.add(counter - 1);
                counter++;
            }
        }

        int spOption;
        do {
            spOption = Integer.parseInt(sc.nextLine());
            if (spOption < 1 || spOption > spIndexes.size() + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (spOption < 1 || spOption > spIndexes.size() + 1);

        int spIndex = spIndexes.get(spOption - 1);
        ServicePersonnel newSp = (ServicePersonnel) persons.remove(spIndex);

        System.out.println();
        System.out.println("Please choose the new section");
        counter = 1;
        for (Section section : Section.values()) {
            System.out.println(counter + ". " + section.name());
            counter++;
        }

        int sectionOp;
        do {
            sectionOp = Integer.parseInt(sc.nextLine());
            if (sectionOp < 1 || sectionOp > Section.values().length + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (sectionOp < 1 || sectionOp > Section.values().length + 1);

        Section newSection = Section.values()[sectionOp - 1];
        newSp.setSection(newSection);
        persons.add(newSp);
    }

    private void printAllPersons() {
        persons.forEach(System.out::println);
    }

    public void addPerson(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus) {
        persons.add(new Person(firstName, lastName, idNumber, maritalStatus));
    }

    public void addEmployee(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, int startDateYear, int officeNumber) {
        persons.add(new Employee(firstName, lastName, idNumber, maritalStatus, startDateYear, officeNumber));
    }

    public void addServicePersonnel(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, int startDateYear, int officeNumber, Section section) {
        persons.add(new ServicePersonnel(firstName, lastName, idNumber, maritalStatus, startDateYear, officeNumber, section));
    }

    public void addStudent(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, ArrayList<Course> courses) {
        persons.add(new Student(firstName, lastName, idNumber, maritalStatus, courses));
    }

    public void addTeacher(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, int startDateYear, int officeNumber, Department department) {
        persons.add(new Teacher(firstName, lastName, idNumber, maritalStatus, startDateYear, officeNumber, department));
    }

    public void showMenu() {
        System.out.println("Welcome, please choose an option");
        do {
            System.out.println("1. ");
        }
    }
}
