import 'dart:math';
import 'package:vector_math/vector_math.dart';

void main() {
  double thetaDeg = radians(30);
  double initVel = 10;
  double grav = 9.8; //Acceleration due to Gravity
  var cosThet = cos(thetaDeg);
  var sinThet = sin(thetaDeg);
  double answer = 2 * (pow(initVel, 2) * sin(thetaDeg) * cos(thetaDeg)) / grav;

  print("Initial Velocity: $initVel"); //Prints Initial Velocity
  print("Theta:  $thetaDeg"); //Prints angle 'Theta'
  print("Sine of Theta: $sinThet"); //Prints Sine of Angle
  print("Cosine of Theta: $cosThet"); //Prints Cosine of Angle
  print("Neglecting air resistance, the expected range of the projectile is: $answer meters");
}
