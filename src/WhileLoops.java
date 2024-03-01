import java.util.Random;

public class WhileLoops {
    public static void main(String[] args)
    {
        int randomNum = new Random().nextInt(10) + 1; //Random numbers for (0 to 9) + 1
        String guessedNumText = null;

        while (!"q".equals(guessedNumText)) //Shortcut to add it, select the parenthesis you want to loop the {ctrl + alt + t}
            {
            guessedNumText = System.console().readLine("Input a number between 0 to 10: "); //reads input from the keyboard.

                if (guessedNumText.matches("-?\\d{1,2}"))
                {
                    int guessedNum = Integer.parseInt(guessedNumText);

                    if(guessedNum == randomNum)
                    {
                        System.out.println("Your input matches the random pick >>>\\s" +randomNum +"\\s.You won!");
                        return; //Stops the program from looping
                    }
                    else
                    {
                        System.out.println("Your input does not match the random number picked. Try again !!");
                    }
                }
            }

    }
}
