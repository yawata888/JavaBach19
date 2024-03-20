package Class6;

import java.util.Scanner;

public class E11Loops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the starting point of the loop");
        int start= scanner.nextInt();
        System.out.println(" Please enter the ending number");
        int end= scanner.nextInt();
        System.out.println("Please enter the step size");
        int stepSize= scanner.nextInt();
        while (start<=end){
            System.out.print(start+" ");
            start=start+stepSize;
        }

         }

    }


