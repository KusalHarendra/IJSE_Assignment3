public class Q17 {
    public static void main(String args[]){
        int x;
        byte b;
        x=Short.MAX_VALUE; //-1
        x=Short.MIN_VALUE;  //0
        x=-1;               //-1
        x=Byte.MAX_VALUE;   //127
        x=Byte.MIN_VALUE;    //-128
        x=0;                  //0
        x=Integer.MAX_VALUE;    //-1
        x=Integer.MIN_VALUE;    //0
        b=(byte)x;
        System.out.println(b);
    }
}
