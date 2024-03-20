package Class4;

public class HW6 {
    public static void main(String[] args) {
        int age=20;
        double weight=130;

        if(age>=18){

            if(weight>110){
                System.out.println("Eligible");
            }else{
                System.out.println("we cannot accept such a patient");
            }
        }else{
            System.out.println("we cannot accept such a patient");
        }


    }
}


