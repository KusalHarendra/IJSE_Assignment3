public class Q6 {
    public static void main(String[] args) {

        System.out.println(1+2+3);                  //prints 6 (arithmetic expression 1+2+3)
        System.out.println("1"+"2"+"3");            //prints 123 (concatenate the three string literals "1", "2", and "3")
        System.out.println('1'+'2'+'3');            //print 150 (dd the character values of '1', '2', and '3', which are 49, 50, and 51 respectively (in ASCII))
        System.out.println('1'+" "+'2'+" "+'3');    //prints 1 2 3 (concatenate the character values of '1', '2', and '3' with spaces characters in between them)
        System.out.println('A'+'B'+'C');            //prints 198 (add the character values of 'A', 'B', and 'C', which are 65, 66, and 67 respectively (in ASCII))
        System.out.println("A"+"B"+"C");            //prints ABC (concatenate the three string literals "A", "B", and "C")
        System.out.println('A'+100+200);            //prints 365 (concatenate the character values of 'A' with two integer values 100 & 200)
        System.out.println('A'+" "+'B'+" "+'C');    //prints A B C (concatenate the character values of 'A', 'B', and 'C' with spaces characters in between them)
    }
}