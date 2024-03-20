package Class4;

public class HW4 {
    public static void main(String[] args) {
        boolean degree=true;
        double gpa=3.5;

        if(degree){
            System.out.println("Congratulations");
            if(gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{

            System.out.println("you should get a degree");
        }
    }
}