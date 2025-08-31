import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input: marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // validation
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                i--; // repeat this subject input
                continue;
            }

            totalMarks += marks[i];
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\n📊 Results:");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + averagePercentage + "%");
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}

