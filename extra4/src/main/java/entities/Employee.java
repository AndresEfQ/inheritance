package entities;

import enums.MaritalStatus;

import java.time.LocalDate;

public class Employee extends Person{
    protected int startDateYear;
    protected int officeNumber;

    public Employee() {
    }

    public Employee(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, int startDateYear, int officeNumber) {
        super(firstName, lastName, idNumber, maritalStatus);
        this.startDateYear = startDateYear;
        this.officeNumber = officeNumber;
    }

    public int getStartDateYear() {
        return startDateYear;
    }

    public void setStartDateYear(int startDateYear) {
        this.startDateYear = startDateYear;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "officeNumber=" + officeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
