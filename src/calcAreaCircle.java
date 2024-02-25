public class calcAreaCircle
{
    public static void main(String[] args) {
        System.out.println(areaOfCircle(3));
    }

    //This method calculates an area of a cirle, using a math formula A = PI * r^2
    public static double areaOfCircle(double radius){
        return java.lang.Math.PI * java.lang.Math.pow(radius, 2);
    }
}
