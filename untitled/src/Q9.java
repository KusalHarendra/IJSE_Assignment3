import java.util.*;
class Q9{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input number 1 : ");
        int num1=input.nextInt();
        System.out.print("Input number 2 : ");
        int num2=input.nextInt();
        System.out.println(num1+" "+num2);

        int num3 = num1;    // Store the value of num1 in a temporary variable

        num1 = num2;    // Assign the value of num2 to num1

        num2 = num3;    // Assign the value of the temporary variable to num2
        System.out.println(num1+" "+num2);
    }
}