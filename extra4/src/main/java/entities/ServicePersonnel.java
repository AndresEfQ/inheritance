package entities;

import enums.MaritalStatus;
import enums.Section;

public class ServicePersonnel extends Employee {
    private Section section;

    public ServicePersonnel() {
    }

    public ServicePersonnel(String firstName, String lastName, long idNumber, MaritalStatus maritalStatus, int startDateYear, int officeNumber, Section section) {
        super(firstName, lastName, idNumber, maritalStatus, startDateYear, officeNumber);
        this.section = section;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "ServicePersonnel{" +
                "section=" + section +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
