package Class4;

public class E5NestedIf {
    public static void main(String[] args) {
        boolean mainDoor = false;
        boolean room1 = false;
        boolean room2 = true;

        if (mainDoor) {
            if (room1) {
            } else {
                System.out.println("Main Door is Closed");
            }
            if(room2){
                System.out.println("Room 2 is open");
            }else{
                System.out.println("Room2 is closed");
            }
        } else {
            System.out.println("Main Door is Closed");
        }

    }
}
