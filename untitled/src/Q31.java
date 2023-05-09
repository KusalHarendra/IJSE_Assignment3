public class Q31 {
    public static void main(String[] args) {
        int x;
        x= 7 % 10 / 2 * 2;
        System.out.println(x);  //6

        x= 7 % (10 / 2) * 2;
        System.out.println(x);  //4

        x= 7 % 10 / (2 * 2);
        System.out.println(x);  //1

        x= 7 % (10 / (2 * 2));
        System.out.println(x);  //1

        x= 7 % ((10 / 2) * 2);
        System.out.println(x);  //7
    }
}
