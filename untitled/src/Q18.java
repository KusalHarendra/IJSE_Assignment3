public class Q18 {
    public static void main(String args[]){
        int a=10, b=7, c=-10, d=-7;

        System.out.println(a%b);    //3
        System.out.println(-a%b);   //-3
        System.out.println(a%-b);   //3
        System.out.println(-a%-b);  //-3
        System.out.println(+a%+b);  //3
        System.out.println(c%d);    //-3
        System.out.println(-c%d);   //3
    }
}
