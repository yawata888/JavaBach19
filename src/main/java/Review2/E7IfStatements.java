package Review2;

public class E7IfStatements {
    public static void main(String[] args) {

        String day="Thursday";
        if(day==("Friday")){
            System.out.println("work");
        } else if (day.equals("Tuesday")) {
            System.out.println("work");
        } else if (day.equals("wednesday")) {
            System.out.println("Leave");
        } else if (day.equals("Thursday")) {
            System.out.println("Work");
        } else if (day.contains("Friday")) {
            System.out.println("Movie");
        } else if (day.equals("Saturday")) {
            System.out.println("relax");
        } else if (day.equals("Sunday")) {
            System.out.println("Relax");
        }else{
            System.out.println("Wrong day");
        }
    }
}
