package entities;

import enums.Department;
import enums.MaritalStatus;

public class Teacher extends Employee {
    private Department department;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, int startDateYear, int officeNumber, Department department) {
        super(firstName, lastName, idNumber, maritalStatus, startDateYear, officeNumber);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department=" + department +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
