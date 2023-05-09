public class Q23 {
    public static void main(String args[]){
        int x=-100;
        x=+x;
        System.out.println(x);  //-100
        x=-x;
        System.out.println(x);  //100
        x=-x;
        System.out.println(x);  //-100
        x=x+x;
        System.out.println(x);  //200
        x=-x-x;
        System.out.println(x);  //400
        x=x-x;
        System.out.println(x);  //0
    }
}
