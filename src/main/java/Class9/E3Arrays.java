package Class9;

public class E3Arrays {
    public static void main(String[] args) {
        int [] numbers={10,25,45,66,85,100};
        //System.out.println(numbers.length);
       // System.out.println(numbers[5]);
        for(int i=numbers.length-1; i>=0; i--){
            System.out.println(i+" "+numbers[i]+" ");
        }
    }
}
