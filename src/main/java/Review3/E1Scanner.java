package Review3;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        if(age>50){
            System.out.println("You will get 20 % discount on toys");
        }else{
            System.out.println("You will get 10% discount");
        }
    }
}
