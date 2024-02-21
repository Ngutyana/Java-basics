public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("bad".matches("[dDb]ad"));  //[Dd] these square brackets remove upper or lower case sensitivity when matching texts
                                                            // You may add any other alphabet in the bracket [Ddb] - Dad,dad,bad - will all return true

        System.out.println("dad".matches("[a-f]ad")); //You may use a (-) to easily list a pattern of characters without having to input them singularly
        System.out.println("Dad".matches("[a-fA-F]ad")); // "a to f" OR "A to F"
        System.out.println("bad".matches("[^b]ad")); //means any character EXCEPT lowercase "b"  === should return false
        System.out.println("Bad".matches("[^b-f]ad")); //means any characters EXCEPT lowercase chars from "b to f"  === should return false
    }
}
