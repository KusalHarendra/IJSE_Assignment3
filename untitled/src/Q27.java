public class Q27 {
    public static void main(String [] args){
        int x=100;
        x=x++;
        System.out.println(x);  //100
        x=x++;
        System.out.println(x);  //100
        x=x++;
        System.out.println(x);  //100
        x=++x;
        System.out.println(x);  //101
        x=++x;
        System.out.println(x);  //102
        x=++x;
        System.out.println(x);  //103
    }
}
