package credy;
import java.util.Random;


class CredentialService {
    public String generateEmailAddress(String firstName, String lastName, String department) {
        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
    }

    public String generatePassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        int passwordLength = 10;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        return password.toString();
    }
}

class Employee extends CredentialService {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;

    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = generateEmailAddress(firstName, lastName, department);
        this.password = generatePassword();
    }

    public void showCredentials() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Your new credentials is : ");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
