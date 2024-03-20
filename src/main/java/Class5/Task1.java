package Class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Loan amount");
        int loan=scan.nextInt();
        if(loan<=2000000){
            System.out.println("You are approve");
        }else{
            System.out.println(" You are not approve");
        }


    }
}
