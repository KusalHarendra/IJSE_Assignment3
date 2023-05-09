public class Q32 {
    public static void main(String[] args) {
        int a=100;
        a= a + (a=6);
        System.out.println(a);  //106

        a= (a=6) + a;
        System.out.println(a);  //12

        a= (a=6) + (a=5);
        System.out.println(a);  //11

        a= a*3 + a;
        System.out.println(a);  //44

    }
}
