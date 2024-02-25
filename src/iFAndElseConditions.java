import java.util.Random;

public class iFAndElseConditions {
    public static void main(String[] args) {

        int input = new Random().nextInt(3)+1;  //the random will generate a number between 0 and 3
        System.out.println("Randomly picked number is: " + input);

         if(input >= 3){
             System.out.println("Declined!");
         }
         else {
             System.out.println("Accepted");
         }

    }

}
