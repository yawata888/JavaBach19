package Class9;

public class E6Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66,85,100,26,89,56,33};
        double sum=0;
        int counter=0;
        for(int n:numbers){
            if(n>25) {
                sum = sum + n;
                counter++;
            }

        }
        System.out.println(sum/counter);

    }
}
