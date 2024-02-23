import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comments {
    public static void main(String[] args) {
        String Regex = """
                       ((?<countryCode>[+]?\\d{2,3})[-.\\s]+)? #Gets country code
                       ((?<areaCode>\\d{3})[-.\\s]+) #Gets area code
                       ((?<exchange>\\d{3})[-.\\s]+) #Gets exchange
                       (?<lineNumber>\\d{3,}) #Gets line number
                       """;
        String number = "+27 021-446-9524";

        System.out.println(number.matches(Regex));

        Pattern numberPattern = Pattern.compile(Regex, Pattern.COMMENTS); //Allowing comments in the regex of the regular expressions.---- NOTE: Pattern.COMMENTS ignores spaces in a string
        Matcher mat = numberPattern.matcher(number);

        if(mat.matches())
        {
            System.out.println("Country code: "+mat.group("countryCode"));
            System.out.println("Area code: "+mat.group("areaCode"));
            System.out.println("Exchange: "+mat.group("exchange"));
            System.out.println("Line number: "+mat.group("lineNumber"));
            System.out.println("\nPhone Number: "+mat.group(0));
        }

    }

}
