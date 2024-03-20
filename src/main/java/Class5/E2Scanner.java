package Class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleaseenter a byte number");
        byte smallBox=scanner.nextByte();
        System.out.println("Please enter a double number ");
        double bigBox=scanner.nextDouble();
        System.out.println("Please enter a boolean value");
        boolean logicalBox= scanner.nextBoolean();

        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(logicalBox);
    }
}
