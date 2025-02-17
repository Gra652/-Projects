import java.util.Scanner;
import java.text.DecimalFormat;

public class Runner {
    public static void main(String[] args) {
        // Instantiate the Tests object
        Tests testScores = new Tests();

        // Call the method to compute the average
        testScores.getAverage();

        // Print the results
        System.out.println(testScores.toString());
    }
}

class Tests {
    private double average;

    // Method to calculate the average, using void as the return type
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("Enter test scores (-1 to quit): ");
        int score = scanner.nextInt();

        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter test scores (-1 to quit): ");
            score = scanner.nextInt();
        }

        // Avoid division by zero
        if (count == 0) {
            average = Double.NaN;  // Not-a-Number (NaN) occurs when dividing by zero
        } else {
            average = sum / count;
        }

        scanner.close();
    }

    // toString method to format and display the average
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "The average of the " + (Double.isNaN(average) ? "0" : (int) (average * 0 + 1)) 
               + " scores entered is " + (Double.isNaN(average) ? "NaN" : df.format(average)) + ".";
    }
}
