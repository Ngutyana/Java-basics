public class blackJackCardGame {
    public static void main(String[] args) {
        String Card = "Ace";
        int currentTotalValue = 10;

        int currentValue = switch(Card){
            case "King", "Queen", "Jack" -> 10;  //If the card is any of the cases, currentValue will return 10
            case "Ace" -> {
                if(currentTotalValue < 11){   //If the input is "Ace", and the currentTotalValue is less than 11,
                    yield  11;                // the currentValue will return 11
                }else {
                    yield 1;                  //if value is currentTotalValue is equal or greater than 11, Ace will return 1
                }
            }
            default -> Integer.parseInt(Card);  //Converting string Card to int.
        };
        System.out.println("Current Value is: " + currentValue);
        System.out.println("Total value: " + (currentValue + currentTotalValue));

        int total = currentValue+currentTotalValue;

        if (total > 21){
            System.out.println("You lost the Game!");
        }
        else if(total == 21){
        System.out.println("You won!!!");
        }
        else{
            System.out.println("Card valid!  Next round");
        }

    }
}
