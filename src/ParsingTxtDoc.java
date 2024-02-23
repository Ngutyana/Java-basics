import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTxtDoc
{
    public static void main(String[] args) {
        String transcript = """
                STUDENT NO:    222252227                         QUALIFICATION:  PG Diploma in ICT
                DATE OF BIRTH: 10-25-1999                        GENDER:         F
                
                SUBJECTS:                                RESULTS:
                Computational Mathematics                Pass
                Database Management Systems              Pass
                Capstone Project                         Pass
                Research Methodology                     Pass
                Programming Paradigms                    Pass
                Project Management                       Pass
                Software Engineering                     Pass
                Information Systems Theories             Pass              
                """;

        String regex = """
                STUDENT\\sNO:\\s{4,}(?<stuNumber>\\d{9})\\s* #Grabing student number
                QUALIFICATION:(?<qual>\\s{2}PG\\sDiploma\\sin\\sICT).* #Grabbing qualification
                DATE\\sOF\\sBIRTH:\\s(?<dob>\\d{2}-\\d{2}-\\d{4}).* #Grabbing Date of birth
                GENDER:(?<gender>\\s+[FM]).* #Grabbing gender
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS); //DOTALL means that the expression will match all the characters using a dot .
        Matcher mat = pat.matcher(transcript);

        if(mat.matches()){
            System.out.print(mat.group("stuNumber"));
            System.out.println(mat.group("qual"));
            System.out.print(mat.group("dob"));
            System.out.println(mat.group("gender"));

            //Unfinished
        }
    }
}
