 
public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 10; // Change these values as needed
        int num2 = 5;
       
        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
       
        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);
       
        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);
       
        // Division
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
