package Class5;

public class E10LogicalOr {
    public static void main(String[] args) {

        double bankBalance=50000;
        double cash=40000;

        if(bankBalance>30000 || cash>30000){
            System.out.println("I can go buy a Toyota");
        }else{
            System.out.println("I need to save more");
        }

    }

}
