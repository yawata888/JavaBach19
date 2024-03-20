package org.examplePractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade:");

        int n = scan.nextInt();
        System.out.println(n);
        if(n >= 90 && n <= 100){
            System.out.println("A");
            if(n >= 80 && n <= 90){
                System.out.println("B");
            }if(n >= 70 && n <= 80){
                System.out.println("C");




            }


        }

}
    }


