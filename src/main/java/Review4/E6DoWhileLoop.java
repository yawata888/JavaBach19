package Review4;

import java.util.Scanner;

public class E6DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=0;
        do{
            System.out.println("PLease enter the number");
             number= scanner.nextInt();
        }while (number<10);


    }
}
