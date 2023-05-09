public class Q21 {
    public static void main(String args[]){
        int x=65;
        final int y=65;
        final int z;
        z=65;
        char ch;
        ch='A'; //legal
        ch=65; //legal
        //ch=x; //illegal
        ch=y; //legal
        //ch=z; //illegal
    }
}
