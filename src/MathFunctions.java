public class MathFunctions {
    public static void main(String[] args) {
        System.out.println(java.lang.Math.abs(-4)); //return absolute value ----remove the negative

        System.out.println(java.lang.Math.ceil(5.0)); //ceiling a value  ----rounds up a value to the higher whole number, 5.0 = 5; ie: result = 5.0
        System.out.println(java.lang.Math.ceil(5.2)); // 5.01 to 6.0 will result to = 6.0 because they are moving to wards the ceiling (upper whole number)

        System.out.println(java.lang.Math.floor(5.0)); //flooring a value  -------rounds up a value to the lower whole number
        System.out.println(java.lang.Math.floor(5.9));  //5.9 to 5.0 will result to 5.0 because they are moving towards the floor(lower whole number value)

        int num1 = 3;
        int num2 = 7;
        System.out.println(java.lang.Math.min(num1,num2));  //selects the minimum value between the two
        System.out.println(java.lang.Math.max(num1,num2));  //selects the maximum value between the two

        System.out.println(java.lang.Math.pow(3, 3));  // 3^3 = 27   NOTE:returns doubles.
        System.out.println(java.lang.Math.pow(2, 3));  // 2^3 = 8   NOTE:returns doubles.

        System.out.println(java.lang.Math.random()); //running random numbers
        System.out.println(java.lang.Math.random() * 10); // telling java to generate random numbers not greater than 10
        System.out.println((int)(java.lang.Math.random() *10)); //making a randoom number an interger

        System.out.println(java.lang.Math.round(7.5)); //rounding of decimals

        System.out.println(java.lang.Math.sqrt(4)); //square root of 4 is 2

        System.out.println(java.lang.Math.PI); //a constant PI

    }
}
