import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age, job:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();

        String job = myObj.nextLine();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("job: " + job);

    }
}
