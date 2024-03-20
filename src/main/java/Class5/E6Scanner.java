package Class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Please Enter your age");
        int age= scanner.nextInt();
        System.out.println("Please enter your Full name");
        scanner.nextLine();
        String fullName= scanner.nextLine();
        System.out.println("your name"+fullName+" you are "+ age+ " years old");

    }
}
