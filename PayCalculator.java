
import java.io.*;
import java.text.DecimalFormat;

public class PayCalculator {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        String line;
        DecimalFormat df = new DecimalFormat("$#.00");

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            writer.write("Name,Pay Rate,Hours Worked,Weekly Pay");
            writer.newLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);
                double weeklyPay;

                if (hoursWorked <= 40) {
                    weeklyPay = hoursWorked * payRate;
                } else {
                    weeklyPay = 40 * payRate + (hoursWorked - 40) * payRate * 1.5;
                }

                String formattedPay = df.format(weeklyPay);
                String outputLine = name + "," + payRate + "," + hoursWorked + "," + formattedPay;
                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("Output file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
