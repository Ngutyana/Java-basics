import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleMatches {

    public static void main(String[] args) {

        String people = """
                Unathi, Ngutyana, 24
                Saabirah, Abrahams, 21
                Unathi, Voko, 26     
                """;
        String regex = "(?<fname>\\w+),\\s(?<lname>\\w+),\\s(?<age>\\d{2})\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        mat.find(44);                               //finds index where it will find a matching string
        System.out.println(mat.group("fname"));
        System.out.println(mat.group("lname"));
        System.out.println(mat.group("age"));

        // specifies the index number
        System.out.println(mat.start("fname"));
        System.out.println(mat.end("lname"));

    }
}
