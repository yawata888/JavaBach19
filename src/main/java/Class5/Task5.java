package Class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of worked years");
        double years=scan.nextDouble();

        if(years>=5){
            System.out.println("Enter your annual salary");
            double salary=scan.nextDouble();
            System.out.println(" You are eligible for the bonus");
            if(salary>50000){
                System.out.println("your bonus is 5000");
            }else{
                System.out.println("your bonus is 3000");
            }
        }else{
            System.out.println("You are not eligible to get a bonus");
        }
    }
}
