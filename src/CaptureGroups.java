import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {
        String phoneNumberRegex = "(([+]?\\d{2,3})[-.\\s]+)?((\\d{3})[-.\\s]+)((\\d{3})[-.\\s]+)(\\d{3,})";
        String phoneNumber = "+27 021-446-9524";

        System.out.println(phoneNumber.matches(phoneNumberRegex));

        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);  //Pattern class
        Matcher matcher = phoneNumberPattern.matcher(phoneNumber); // checks a string whether it matches the pattern.

        if(matcher.matches()) //Calling a matcher to confirm if the string matches the regex
        {
            /*
            Note:
               Capture group(0) is the entire string
               Capture groups are determined by regex parenthesis -- ([+]?27[-.\s]+) -- group1
               A group may be created within a group :  (([+]?\\d{2,3})[-.\s]+) = group 1
                                                        ([+]?\\d{2,3}) = group 2
            */


            //Will print whatever string is in the regex capture groups
            //NB: Chose this groups to remove the divider
            System.out.println("Country code: "+matcher.group(2));
            System.out.println("Area code: "+matcher.group(4));
            System.out.println("Exchange: "+matcher.group(6));
            System.out.println("Line number "+matcher.group(7));
            System.out.println("\nPhone Number: "+matcher.group(0));
        }

    }
}
