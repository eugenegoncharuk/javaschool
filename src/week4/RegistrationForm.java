package week4;

public class RegistrationForm {

    private String firstName;
    private String lastName;

    public RegistrationForm(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public RegistrationForm(String firstName) {
        this(firstName, "NA");
    }

    public RegistrationForm() {
        this("NA");
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

}
