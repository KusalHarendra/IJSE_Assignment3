public class Q5 {
    public static void main(String [] args){
        char a = '\u0061';      //correct declarations?
        //char 'a' = 'a';         //incorrect because cannot use a single quote in front of a variable name
        //char \u0061 = 'a';      //correct beacuse \u0061 = unicode value of "a" , but less readability
        //ch\u0061r a = 'a';      //correct beacuse \u0061 = unicode value of "a" , but less readability
        //ch'a'r a = 'a';         //incorrect beacuse cannot use a single quote in front of a variable name
    }
}
