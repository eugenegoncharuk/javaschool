package week4;

public class Main {

    public static void main(String[] args) {
        RegistrationForm r1 = new RegistrationForm("Eugene", "Goncharuk");
        System.out.println(r1);

        RegistrationForm r2 = new RegistrationForm("Vasja");
        System.out.println(r2);

        RegistrationForm r3 = new RegistrationForm();
        System.out.println(r3.getFirstName());
    }

}
