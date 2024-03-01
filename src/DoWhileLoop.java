import java.util.Random;

public class DoWhileLoop {
    public static void main(String[] args) {
        int random = new Random().nextInt(10) + 1; //Random numbers for (0 to 9) + 1
        System.out.println("Random Number is: "+random);
        String guessedNumText = null;
        int wrongGuess = 1; //records the first count of looping as 1 hence initialised to 1

        do {
            guessedNumText = System.console().readLine("Input any number between 1 and 10");
            if (guessedNumText.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(guessedNumText);
                if (guessedNum == random) {

                    String vocab = wrongGuess == 1 ? " try":" tries";
                    System.out.printf("Your input matches the random pick >>> %d. You won after %d %s %n",random, wrongGuess, vocab);
                    return; //Stops the program from looping
                } else {

                    System.out.println("Wrong guess, try again!!!");
                    if(wrongGuess >= 4){
                        System.out.println("Ending program!! You have exceeded your guess count");
                        return;
                    }
                    wrongGuess++; //should the number not match thr random, then wrongGuess will increment
                }
            }
        }while (!"q".equals(guessedNumText));  //When they input q, will terminate the loop
    }
}
