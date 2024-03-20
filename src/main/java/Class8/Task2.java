package Class8;
//Add all of the elements from this 2 D arrays and print the sum
public class Task2 {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,40,50},
                {22,40,90,65},
                {15,50,33,30},
        };
        int evenSum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenSum += matrix[i][j];
                }
            }
            System.out.println(evenSum);
        }
    }
}
