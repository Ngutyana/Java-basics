public class calcAreaCircle
{
    public static void main(String[] args) {
        System.out.println(areaOfCircle(3));
    }

    public static double areaOfCircle(double radius){

        //A = PI * r^2
        return java.lang.Math.PI * java.lang.Math.pow(radius, 2);
    }
}
