import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {
        //Naming groups using ?<>
        String phoneNumberRegex = "((?<countryCode>[+]?\\d{2,3})[-.\\s]+)?((?<areaCode>\\d{3})[-.\\s]+)((?<exchange>\\d{3})[-.\\s]+)(?<lineNumber>\\d{3,})";
        String phoneNumber = "+27 021-446-9524";

        System.out.println(phoneNumber.matches(phoneNumberRegex));

        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);  //Pattern class
        Matcher match = phoneNumberPattern.matcher(phoneNumber); // checks a string whether it matches the pattern.

        if(match.matches()) //Calling a matcher to confirm if the string matches the regex
        {
            System.out.println("Country code: "+match.group("countryCode"));
            System.out.println("Area code: "+match.group("areaCode"));
            System.out.println("Exchange: "+match.group("exchange"));
            System.out.println("Line number "+match.group("lineNumber"));
            System.out.println("\nPhone Number: "+match.group(0));


        }

    }
}

/* ------------------------------ OTHER WAYS TO DO IT ----------------

N0.1


            Note:
               Capture group(0) is the entire string
               Capture groups are determined by regex parenthesis -- ([+]?27[-.\s]+) -- group1
               A group may be created within a group :  (([+]?\\d{2,3})[-.\s]+) = group 1
                                                        ([+]?\\d{2,3}) = group 2

            Will print whatever string is in the regex capture groups
            NB: Chose this groups to remove the divider

            String phoneNumberRegex = "(([+]?\\d{2,3})[-.\\s]+)?((\\d{3})[-.\\s]+)((\\d{3})[-.\\s]+)(\\d{3,})";
                           System.out.println("Country code: "+match.group(2));
                           System.out.println("Area code: "+match.group(4));
                           System.out.println("Exchange: "+match.group(6));
                           System.out.println("Line number "+match.group(7));
                           System.out.println("\nPhone Number: "+match.group(0));


NO.2


 ?: can be used to choose the desired inner capture groups by blocking the external

                You insert the ?:  before the inner group parenthesis

        (?:([+]?\d{2,3})[-.\s]+)?(?:(\d{3})[-.\s]+)(?:(\d{3})[-.\s]+)(\d{3,})

        When ?: is included, the numbering of groups changes, making it simpler and more straight forward.

            System.out.println("Country code: "+match.group(1));
            System.out.println("Area code: "+match.group(2));
            System.out.println("Exchange: "+match.group(3));
            System.out.println("Line number "+match.group(4));


*/