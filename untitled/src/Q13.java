public class Q13 {
    public static void main(String args[]) {
        int tot = 971;
        double avg1,avg2,avg3,avg4;
        avg1 = (double) tot/10;  //prints 97.1
        avg2 = tot/(double)10;   //prints 97.1
        avg3 = (double)(tot/10); //prints 97.0
        avg4 = tot/10;           //prints 97.0
        System.out.println("Average : " +  + avg1);
        System.out.println("Average : " +  + avg2);
        System.out.println("Average : " +  + avg3);
        System.out.println("Average : " +  + avg4);
    }
}
