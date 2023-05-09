import java.util.Scanner;

public class Q3 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");  //input age
        int age = input.nextInt();

        age += 3;                               //calculate age after 3 years

        System.out.println("New age  = " + age);


    }
}