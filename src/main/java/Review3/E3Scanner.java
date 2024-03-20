package Review3;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name= scan.nextLine();
        System.out.println("Please enter the color that you like ");
        String color= scan.nextLine();
        System.out.println(name+" "+color);
        if(color.equalsIgnoreCase("blue")){

            if(name.equalsIgnoreCase("Ana")){
                System.out.println("I am a very good driver ");
            }else{
                System.out.println("I am will");
            }
            }else{
                System.out.println("You are very boring");

        }

    }
}
