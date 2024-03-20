package Class9;

public class E4Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66,85,100};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("The average of the given numbers is: " + average);
    }
}
