import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        int highest = 0;
        int lowest = 100;
        int sum = 0;

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Student Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            sum += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("\n----- Student Report -----");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }

        System.out.println("Average Marks = " + average);
        System.out.println("Highest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);

        sc.close();
    }
}