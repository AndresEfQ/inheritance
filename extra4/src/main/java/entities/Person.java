package entities;

import enums.MaritalStatus;

public class Person {

    protected String firstName;
    protected String lastName;
    protected long idNumber;
    protected MaritalStatus maritalStatus;

    public Person() {
    }

    public Person(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.maritalStatus = maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", maritalStatus=" + maritalStatus +
                '}';
    }
}
