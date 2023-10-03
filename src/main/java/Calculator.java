public class Calculator{

    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double division(double num1, double num2) {
    	if(num2==0) {throw new ArithmeticException();}
        return num1 /num2;
    }

    
}


