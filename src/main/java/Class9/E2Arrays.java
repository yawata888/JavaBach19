package Class9;

public class E2Arrays {
    public static void main(String[] args) {
        int [] numbers={10,25,45,66,85,100};
        //System.out.println(numbers.length);
       // System.out.println(numbers[5]);
        for(int i=0; i< numbers.length; i=i+2){
            System.out.println(i+" "+numbers[i]+" ");
        }
    }
}
