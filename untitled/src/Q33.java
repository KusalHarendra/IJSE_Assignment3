public class Q33 {
    public static void main(String[] args) {
        int a=10;
        int x;
        x= a++ + a;
        System.out.println(x);  //21

        x= a + a++;
        System.out.println(x);  //22

        x= ++a + a;
        System.out.println(x);  //26

        x= a + ++a;
        System.out.println(x);  //27

        x= ++a + ++a;
        System.out.println(x);  //31

        x= a++ + a++;
        System.out.println(x);  //33

        x= ++a + a++;
        System.out.println(x);  //38

        x= a++ + ++a;
        System.out.println(x);  //42





    }
}
