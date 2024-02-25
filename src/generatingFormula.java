import java.lang.Math;
public class generatingFormula
{
    public static void main(String[] args) {
        System.out.println(areaOfCircle(3));
        System.out.println(velocityPath(0.8, 3));
        System.out.println(centripetalAcc(1.67,.8));
        System.out.println(centripetalForce(0.2, 3.504));
    }

    //This method calculates an area of a circle, using a math formula A = PI * r^2
    public static double areaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    //This method calculates the velocity path
    public static double velocityPath(double radius, double period){
        double circumference = 2 * Math.PI * radius;
        return circumference/period;
    }

    //This method calculates centripetal acceleration
    public static double centripetalAcc(double path, double radius){
        return Math.pow(path, 2)/radius;
    }

    //Calculating centripetal force
    public static double centripetalForce(double mass, double acc){
        return  mass*acc;
    }

}
