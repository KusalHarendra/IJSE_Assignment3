public class Q29 {
    public static void main(String [] args){
        int a=10,b=20;
        int x;

        x= a + b;
        System.out.println(x);      //30

        x= a +- b;
        System.out.println(x);      //-10

        x= ++a + b;
        System.out.println(x);      //31

        x= a + b++;
        System.out.println(x);      //31

        x= ++a + b++;
        System.out.println(x);      //33

        x= a++ + b++;
        System.out.println(x);      //34

        x= ++a + ++ b;
        System.out.println(x);      //38

        x= a++ + ++b;
        System.out.println(x);      //39
    }
}
