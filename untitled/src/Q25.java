public class Q25 {
    public static void main(String [] args){
        int x=100,y;
        y=x++;
        System.out.println(x+" "+y);    //101 100
        y=x++;
        System.out.println(x+" "+y);    //102 101
        y=x++;
        System.out.println(x+" "+y);    //103 102
    }
}
