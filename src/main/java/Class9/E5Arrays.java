package Class9;

public class E5Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66,85,100};
        int sum=0;
        for(int n:numbers){
            sum= sum+ n;

        }
        System.out.println(sum/ numbers.length);

    }
}
