import java.security.SecureRandom;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random randomN = new Random();
        System.out.println(randomN.nextInt()); //random numbers
        System.out.println(randomN.nextInt(18)); //not more than 18


        //Preferred random to be used for highly secured things link encryption
        SecureRandom random = new SecureRandom();
        System.out.println(random.nextInt(20));


    }
}
