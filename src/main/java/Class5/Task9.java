package Class5;
/*Write a program that will ask user to input the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
If anything else print invalid
 */
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the current time");

        int hour= scanner.nextInt();
        if(hour >=1 && hour<=11){
            System.out.println("It is Morning");
        }else if(hour>=12 && hour<=15){
            System.out.println("It is Afternoon");
        }else if(hour>=16 && hour<=20){
            System.out.println("It is Evening");
        }else if(hour>=21 && hour<=24){
            System.out.println("It is Night");
        }else{
            System.out.println("wrong day");
        }



    }
}
