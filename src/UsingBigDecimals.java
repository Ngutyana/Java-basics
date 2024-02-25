import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class UsingBigDecimals {
    public static void main(String[] args) {
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP); //precision sets the bid decimal to the number of digits that should return

        System.out.println(new BigDecimal("2.466").add(new BigDecimal(".5692665"))); //Addition
        System.out.println(new BigDecimal("2.466").subtract(new BigDecimal(".5692665"))); //Subtraction
        System.out.println(new BigDecimal("13").remainder(new BigDecimal("8"))); //Subtraction
        System.out.println(new BigDecimal("2.466").divide(new BigDecimal(".5692665"), mc)); //division using a math context to be execute
        System.out.println(new BigDecimal("2.466").sqrt(mc)); //Square root


    }
}
