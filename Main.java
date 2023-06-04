package credy;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Select department:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        System.out.print("Enter department number: ");
        int departmentChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String department = "";
        switch (departmentChoice) {
            case 1:
                department = "Technical";
                break;
            case 2:
                department = "Admin";
                break;
            case 3:
                department = "Human Resource";
                break;
            case 4:
                department = "Legal";
                break;
            default:
                System.out.println("Invalid department choice.");
                System.exit(1);
        }

        Employee employee = new Employee(firstName, lastName, department);
        employee.showCredentials();
    }
}
