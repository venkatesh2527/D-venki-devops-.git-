public class arith {
    
    public static double square(double num) {
        return num * num;
    }

    public static double cube(double num) {
        return num * num * num;
    }

    public static double modulus(double num, double divisor) {
        return num % divisor;
    }

    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}