public class Math {
    public static void main(String[] args) {
        System.out.println(10 - 3); //subtraction
        System.out.println(10 + 3); //addition
        System.out.println(10 * 3); //multiplication
        System.out.println(10 / 3); //division
        System.out.println(10 % 3); //modulus returns the reminder of the calculation ie; the answer will be 1

        System.out.println(10 / 3); // will only return an INT, a whole number.
        System.out.println(10f / 3); //f means float, therefore a decimal will be printed.
        System.out.println(10d / 3); //f means double, therefore a decimal will be printed.

        System.out.println((double)10 / 3); //telling java that 10 is a double, therefore the answer will return as a double


        //Note precedence
        System.out.println(3+5*2); //multiplication and division precedes addition and subtraction sign ie; the answer will be 13
        System.out.println((3+5)*2); //use parenthesis to ensure that addition/subtraction is calculated before division/multiplication ie; the answer will be 16

        //Algebraic expressions
        int x = 1;
        System.out.println(x);
        x = x + 1;  //the new x will result to initialised x value ie; x = 1+1
        /*     other ways to do the same expression
             x+=1;
             x++   //incrementing x value post fix
             ++x   //incrementing x value pre fix
        */
        System.out.println(x); // = 2

/*
        decrement
        x-=1
        x--
        --x
        x = x-1
*/
    }
}
