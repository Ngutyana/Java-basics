import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Compundinterest {

    // Balance(Y) = P(1 + r)^Y + c[ ( (1 + r)^Y - 1) / r]
    public static BigDecimal calculate(String principal, String rate, int period, String contribution) {

        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)).pow(period); // (1 + r)^Y
        BigDecimal c = a.subtract(BigDecimal.ONE); // (1 + r)^Y - 1)
        BigDecimal d = c.divide( new BigDecimal(rate)); //(1 + r)^Y - 1) / r
        BigDecimal e = d.multiply( new BigDecimal(contribution)); // c[ ( (1 + r)^Y - 1) / r]
        BigDecimal f = a.multiply( new BigDecimal(principal)); //P(1 + r)^Y
        BigDecimal g = f.add(e);
        return g;
    }

    public static void main(String[] args) {



        NumberFormat currency = NumberFormat.getCurrencyInstance(); // using number formats to print currency, reading computer's current location
        NumberFormat FranceCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE); // using number formats to specify the currency I want

        System.out.println(currency.format(calculate("10000.00",".08",10, "1000")));
        System.out.println(FranceCurrency.format(calculate("10000.00",".08",10, "1000")));

        //  # can be used as a number sign
        System.out.println(new DecimalFormat("R##,###.#")
                .format(calculate("10000.00",".08",10, "1000"))); //Decimal format used

        //Percent format
        DecimalFormat pf = new DecimalFormat("#%");
        System.out.println(pf.format(.08));

        //Using printf [print format] rather than calling a format method
        BigDecimal format = Compundinterest.calculate("10000.00",".08",10, "1000");
        System.out.printf("R%,(.2f%n", format);


    }
}
