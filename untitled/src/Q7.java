public class Q7 {
    public static void main(String asrg[]){
        char a='a'; //This line declares a variable named a of type char and initializes it with the character value of 'a'.
        //System.out.println(a=='\u0061'); //prints true (compares the value of the 'a' variable to the Unicode escape sequence \u0061,)
        //System.out.println(\u0061=='\u0061'); //prints true (compares the Unicode escape sequence \u0061 to itself. )
        //System.out.println(\u0061==97); //prints true (compares the Unicode escape sequence \u0061 to the integer value 97,
                                         // which represents the character value of 'a' in decimal form.)
        //\u0061='\u0041'; //attempts to assign the Unicode escape sequence \u0041, which represents the character value of 'A',
                             // to the variable \u0061. This line will cause a compilation error because \u0061 is not a variable name.
        System.out.println('A'=='\u0041'); //prints true. (compares the character literal 'A' to the Unicode escape sequence \u0041,
                                            // which represents the character value of 'A'. )
        System.out.println(65=='\u0041'); //prints true (compares the integer value 65 to the Unicode escape sequence \u0041,
                                            // which represents the character value of 'A' in hexadecimal form.)
        System.out.println(65==a); //prints false (This line compares the integer value 65 to the value of the a variable,
                                    // which is the character value of 'a')
        System.out.println('\u0041'==a); //prints false ( This line compares the Unicode escape sequence \u0041, which represents the character value of 'A',
                                            // to the value of the a variable, which is the character value of 'a')
    }
}
