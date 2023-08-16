import java.util.Scanner;

public class StudentSystem {
    public static void main(String args[]) {
        int marks[] = new int[5];
        int i;
        float total = 0, percentage, avg;
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        percentage = (total / 500) * 100;
        System.out.println("Percentage is: " + percentage);

        avg = total / 5;
        System.out.println("The total marks are:" + total);
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
        scanner.close();
    }
}
