import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] students = new String[n];

        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextLine();
        }

        System.out.println("\n=== Seating Allotment ===");
        System.out.println("-------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Seat " + (i + 1) + " -> " + students[i]);
        }

        sc.close();
    }
}