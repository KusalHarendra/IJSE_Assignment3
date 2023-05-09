import java.sql.SQLOutput;
import java.util.Scanner;

public class Q2 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first integer value : ");
        int value1 = input.nextInt();

        System.out.print("Enter your second integer value : ");
        int value2 = input.nextInt();

        System.out.println("Value 1  = " + value1);
        System.out.println("Value 2  = " + value2);
        System.out.println("Values are  = " + value1 + " , " + value2);

    }
}