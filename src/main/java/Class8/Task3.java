package Class8;

public class Task3 {
    public static void main(String[] args) {
        String[][] students = {
                {"Alice", "Bob", "Charlie", "David"},
                {"A", "B", "C", "A"}
        };

        for (int i = 0; i < students[0].length; i++) {
            if (students[1][i].equals("A") || students[1][i].equals("B")) {
                System.out.println(students[0][i]);
            }
        }
    }
}
