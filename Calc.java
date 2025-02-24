public class Calc {
    // Private data fields
    private double num1;
    private double num2;
    
    // Constructor that initializes both numbers
    public Calc(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Getter for num1
    public double getNum1() {
        return num1;
    }
    
    // Getter for num2
    public double getNum2() {
        return num2;
    }
    
    // Returns the sum of num1 and num2
    public double getSum() {
        return num1 + num2;
    }
    
    // Returns the difference (num1 - num2)
    public double getDifference() {
        return num1 - num2;
    }
    
    // Returns the product of num1 and num2
    public double getProduct() {
        return num1 * num2;
    }
    
    // Returns the quotient (num1 / num2)
    public double getQuotient() {
        return num1 / num2;
    }
    
    // Overrides the toString() method to display the private data fields
    @Override
    public String toString() {
        return "Num1: " + num1 + "\n" + "Num2: " + num2;
    }
}
