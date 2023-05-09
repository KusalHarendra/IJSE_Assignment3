import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two numbers  = " + sum);

    }
}