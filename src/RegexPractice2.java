public class RegexPractice2 {
    public static void main(String[] args) {
        System.out.println("Girly".matches(".{5}"));     // a . matches any character in a regex
        System.out.println("Girly".matches("^....."));   // a ^ matches the beginning of the string
        System.out.println("Girly".matches("^.....$"));  // a $ matches the end of the string
    }
}
