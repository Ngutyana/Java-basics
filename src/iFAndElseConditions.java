import java.util.Random;

public class iFAndElseConditions {
    public static void main(String[] args) {

//using a random to prove the condition
//No1
int input = new Random().nextInt(4)+1;  //the random will generate a number between 0 and 3
        System.out.println("Randomly picked number is: " + input);

         if(input >= 3){                                  // >= operator {greater or equal}
             System.out.println("Declined!");
         }
         else {
             System.out.println("Accepted");
         }
//No2
        if(input < 3){                                  // < operator {less or equal}
            System.out.println("Yellow");
        }
         else
        {
            System.out.println("Pink");
        }
//No3
        if (input < 3 || (input % 2 == 0)) {       // || operator {Or} ---- ( %2 == 0) means an even number
            System.out.println("Green");
        }
//No4
        if (input > 1 && (input % 2 == 0)) {       // && operator {and} --- ( %2 == 0) means an even number
            System.out.println("Purple");
        }


//Using boolean method to prove the condition
        if(booleanCondition()){
            System.out.println("Declined!");
        }
        else {
            System.out.println("Accepted");
        }

//using multiple else statements
        if(input == 1){                                           // == operator  {equal to}
            System.out.println("Won first place!");
        }
        else if (input == 2) {
            System.out.println("Won second place!");
        }
        else if (input == 3) {
            System.out.println("Won third place!");
        }
        else
        {
            System.out.println("Unfortunately!! you did not win!");
        }

//using a string

        String command = "Sit";

        if (command.equals("Okay")){
                System.out.println("Sitting down");
        }
        else if(command.equals("No")){
            System.out.println("Refusing to sit");
        }
        else
                System.out.println("ignore!");

    }

    private static boolean booleanCondition(){
        return false;  //if the boolean is true, the first statement will be accepted, if false, 2nd statement will be accepted
    }

}
