public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("bad".matches("[dDb]ad"));  //[Dd] these square brackets remove upper or lower case sensitivity when matching texts
                                                            // You may add any other alphabet in the bracket [Ddb] - Dad,dad,bad - will all return true

        System.out.println("dad".matches("[a-f]ad")); //You may use a (-) to easily list a pattern of characters without having to input them singularly
        System.out.println("Dad".matches("[a-fA-F]ad")); // "a to f" OR "A to F"
        System.out.println("bad".matches("[^b]ad")); //means any character EXCEPT lowercase "b"  === should return false
        System.out.println("Bad".matches("[^b-f]ad")); //means any characters EXCEPT lowercase chars from "b to f"  === should return false

        /*This means the regex must match regardless any word character inserted initially
            \\w   means input words, numbers and _
            \\d"  means input numbers
            \\s"  means input spaces
        */

        System.out.println("dad".matches("\\wad"));  //"\w" means Word Characters ------- "\\w" use a double backslash to remove syntax error
        System.out.println("bhj".matches("\\w\\w\\w")); //Should return true

        //Matching longer digits
        System.out.println("021-446-9524".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
        //OR
        System.out.println("021-446-9524".matches("\\d{3}-\\d{3}-\\d{4}")); //inside the curly brackets, insert the number of digits expected
        System.out.println("021-446-952".matches("\\d{3}-\\d{3}-\\d{3,4}")); //using curly brackets {3,4} to limit the number --- 3 or 4 digits
        System.out.println("021-446-952".matches("\\d{3}-\\d{3}-\\d{3,}")); // {3,} --- minimum of 3 digits, meaning 3 or more digits can be accepted
        System.out.println("021.446.9524".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}")); //using [-.] to expand options on the number format acceptance

        /*   Symbols:
                 + means one or more
                 * means zero or more
                 ? means 0 or one
        */

        System.out.println("021..446-.9524".matches("\\d{3}[-.]+\\d{3}[-.]+\\d{4}")); //adding a "+" means you may add one or more of the [-.] match options
        System.out.println("021446--.9524".matches("\\d{3}[-.]*\\d{3}[-.]*\\d{4}")); //adding an "*" means you may add zero or more of the [-.] match options
        System.out.println("021446-9524".matches("\\d{3}[-.]?\\d{3}[-.]?\\d{4}")); //adding an "?" means you may add zero or one of the [-.] match options
        System.out.println("021 446 9524".matches("\\d{3}\\s\\d{3}\\s\\d{4}")); //Adding spaces within the digits using "\\s" expression

        //Adding all the expressions in one output
        System.out.println("021   446---9524".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]+\\d{4,}"));

        /* Easier way to deal with double expressions
             "\d{3}[-.\s]+"    is duplicated
             "(\d{3}[-.\s]+){2}"  most appropriate to use the {2} curly brackets to write th expressions rather than "\d{3}[-.\s]+\d{3}[-.\s]+"
         */

        System.out.println("021-446-9524".matches("(\\d{3}[-.\\s]+){1,2}\\d{3,}")); //All the match scenarios



    }
}
