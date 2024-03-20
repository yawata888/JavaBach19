package Class9;

public class E7Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66,85,100,26,89,56,33};
        int even=0;
        for(int num:numbers){
            if(num%2==0){
                even++;
            }
        }
        System.out.println(even);
        }
    }
