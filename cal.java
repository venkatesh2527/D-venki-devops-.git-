import java.util.Scanner;
 
public class cal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 

        System.out.print(" first number: ");
        int x = sc.nextInt();
        System.out.print(" second number: ");
        int y = sc.nextInt();

        System.out.print("Enter the operation");
        String operation = sc.next();
        int result = performOperation(x, y, operation);
        System.out.println("Your answer is: " + result);
    }
 
    public static int performOperation(int x, int y, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":
            System.out.print(" first number: ");
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "%":
                result = x % y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}