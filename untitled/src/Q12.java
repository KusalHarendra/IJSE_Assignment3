public class Q12 {
    public static void main(String args[]){
    long l;
    l = 2147483647; //legal
    //l = 2147583647; //illegal
    l = 0xabcd;     //legal
   // l = 0bcdL;      //illegal
    l = 0101010110L;    //legal
    System.out.println(l);
}
}
