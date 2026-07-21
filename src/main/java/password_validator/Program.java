package password_validator;

import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PasswordValidator validator = new PasswordValidator();
        boolean running = true;

        while (running) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            List<PasswordError> errors = validator.getErrors(password);

            if (errors.isEmpty()) {
                System.out.println("Password is valid!");
            } else {
                System.out.println("Password is INVALID!\n");
                for (PasswordError error : errors) {
                    System.out.println(error.getMessage());
                }
            }

            System.out.println("\nDo you want to check another password? (Y/N)");
            while (true) {
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                    break;
                } else if (answer.equalsIgnoreCase("N")) {
                    running = false;
                    break;
                } else {
                    System.out.print("Input 'Y' or 'N': ");
                }
            }
        }
        scanner.close();
    }
}
