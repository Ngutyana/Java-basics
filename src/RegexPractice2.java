public class RegexPractice2 {
    public static void main(String[] args) {
        System.out.println("Girly".matches(".{5}"));     // a . matches any character in a regex
        System.out.println("Girly".matches("^....."));   // a ^ matches the beginning of the string
        System.out.println("Girly".matches("^.....$"));  // a $ matches the end of the string
        System.out.println("girly Girl".matches(".....\\s\\b...."));  // a boundry"\\b" character matches an area between a word character and a non-word character

        System.out.println("girl".matches("\\w\\w\\w\\w"));  // matches any word character
        System.out.println("-?/.".matches("\\W\\W\\W\\W"));  // matches anything other than word character

        /*           NOTE:

        \\s = space and \\S = none space ie:any character that is not a space
        \\d = digit and \\D = any character that is not a digit

         */
    }
}
