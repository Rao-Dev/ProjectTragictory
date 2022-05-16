import static java.lang.Math.*;
import static java.lang.System.*;

public class RangeEquation {
    public static void main(String [] args) {
        double thetaDeg = toRadians(30);
        double initVel = 10;
       
        out.printf("Neglecting air resistance, the expected range of the projectile is: %.2f meters", rangeCalc(thetaDeg, initVel));
       
       
    }
   
    public static double rangeCalc(double theta, double initVel)
    {
        //Range Equation: x=(2v^2*sin(theta)*cos(theta))/g
        double grav = 9.8;
        double thetaDeg = theta;
       
        double answer = 2*(pow(initVel, 2)*sin(thetaDeg)*cos(thetaDeg))/grav;
       
        out.println("Initial Velocity: " + initVel);
        out.println("Theta: " + thetaDeg);
        out.println("Sine of Theta: " + sin(thetaDeg));
        out.println("Cosine of Theta: " + cos(thetaDeg));
        return answer;
    }
   
}
