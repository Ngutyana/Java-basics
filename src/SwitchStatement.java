import java.util.Random;

public class SwitchStatement {

    public static void main(String[] args) {

        int input = new Random().nextInt(4)+1;

        System.out.println("Randomly picked number is: " + input);

        //Using a switch instead of a loop
        switch (input) {
            case 1:  //if input is 1
                System.out.println("Won first place!");
                break;  //breaks so the program will run through without breaking

            case 2:  //if input is 2
                System.out.println("Won second place!");
                break;

            case 3:  //if input is 3
                System.out.println("Won third place!");
                break;

            default:  //else
                System.out.println("Unfortunately!! you did not win!");
        }


        String command = "Sit";
        switch (command){
            case "Okay":
                System.out.println("Sitting down");
                break;

            case "No":
                System.out.println("REfusing to sit");
                break;

            default:
                System.out.println("ignore!");
        }

    }
}


/*
        if(input == 1 ){
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

 */