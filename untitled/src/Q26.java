public class Q26 {
    public static void main(String [] args){
        int x=100,y;
        y=++x;
        System.out.println(x+" "+y);    //101 101
        y=++x;
        System.out.println(x+" "+y);    //102 102
        y=++x;
        System.out.println(x+" "+y);    //103 103
    }
}
