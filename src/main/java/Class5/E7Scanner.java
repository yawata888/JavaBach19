package Class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scanner1.nextInt();
        System.out.println("Please enter your full name");
        String fullName= scanner2.nextLine();
        System.out.println("Your full name and age is "+fullName+" "+age);


    }
}
