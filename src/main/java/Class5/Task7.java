package Class5;
/* Write a program that will prompt the user for
Day number and print whether it is a weekend or weekday. If any day from 1-5 → output “It is a
weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
Test your task for -1 3 6 and 8
*/
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("It is a **weekday**.");
        } else if (dayNumber >= 6 && dayNumber <= 7) {
            System.out.println("It is a **weekend**.");
        } else {
            System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }

    }
}
