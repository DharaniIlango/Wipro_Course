import java.util.*;

public class ClassObject02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //calling the powerInt method
        System.out.println("Result of powerInt method: " + powerInt(num1, num2));
        //calling the powerDouble method
        System.out.println("Result of powerDouble method: " + powerDouble(num1, num2));
    }

    public static int powerInt(int num1, int num2) {
        double resultValue = Math.pow(num1, num2);
        int result = (int)resultValue;
        return result;
    }

    public static double powerDouble(double num1, double num2) {
        double resultValue = Math.pow(num1, num2);
        return resultValue;
    }
}