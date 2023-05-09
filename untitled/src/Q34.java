public class Q34 {
    public static void main(String[] args) {
        int x, y;
        x = y = 100;
        x = x++ + x++ + x++;
        System.out.println(x);      //303
        y = ++y + ++y + ++y;
        System.out.println(y);      //306
        y = x = 100;
        System.out.println();       //
        x = x++ + ++y + ++x + y++;
        System.out.println(x + " " + y);    //404 102
    }
}
