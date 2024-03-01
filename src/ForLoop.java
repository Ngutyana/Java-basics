import java.util.Random;

public class ForLoop
{
    public static void main(String[] args)
    {
        int random = new Random().nextInt(10) + 1; //Random numbers for (0 to 9) + 1
        System.out.println("Random Number is: "+random);
        String guessedNumText = null;
        int wrongGuess;

        /*        For Loop standard syntax
        for(variable; define looping criteria; increment or decrement the variable)
        */
        for ( wrongGuess = 1; wrongGuess <= 4; wrongGuess++)  //initialises the loop count
        {
            guessedNumText = System.console().readLine("Input any number between 1 and 10");
            if (guessedNumText.matches("-?\\d{1,2}"))
            {
                int guessedNum = Integer.parseInt(guessedNumText);
                if (guessedNum == random)
                {
                    String vocab = wrongGuess == 1 ? " try":" tries";
                    System.out.printf("Your input matches the random pick >>> %d. You won after %d %s %n",random, wrongGuess, vocab);
                    return; //Stops the program from looping
                } else
                {
                    System.out.println("Wrong guess, try again!!!");
                    if(wrongGuess >= 4)
                    {
                        System.out.println("Ending program!! You have exceeded your guess count");
                        return;
                    }
                }
            }
        }


    }
}
