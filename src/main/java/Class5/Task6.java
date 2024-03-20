package Class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the person's height in inches: ");
        int heightInInches = scanner.nextInt();

        if (heightInInches < 60) {
            System.out.println("This person is **short**.");
        } else if (heightInInches >= 60 && heightInInches <= 72) {
            System.out.println("This person is of **medium** height.");
        } else {
            System.out.println("This person is **tall**.");
        }
    }
}
