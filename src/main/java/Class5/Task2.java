package Class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("You can get a driver license");
        }else {
            System.out.println(" You can not get a driver license");
        }
    }
}
