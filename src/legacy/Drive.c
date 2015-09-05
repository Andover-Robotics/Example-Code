
//--------------- Variables, Includes ------------------//
// Variables from Drive.c can be read directly from     //
// Main.c, but variables in Main.c can not be accessed  //
// Drive.c. Include statements in Drive.c carry over to //
// Main.c when Drive.c is included.                     //
//------------------------------------------------------//

#include "JoystickDriver.c"			// Include Joystick Routines, does not need to be included in Main
int powerL = 0;
int powerR = 0;

//------------------------------------------------------//
// Drive calculates the power of both motors and outputs
// and stores them as variables for later use
// takes input as 2 integers
void drive(int leftPower, int rightPower)
{
	powerL = leftPower;
	powerR = rightPower;
}

//------------------------------------------------------//
// LeftDriveCalculate calculates the power of the left
// motor and then returns it as an integer.
int LeftDriveCalculate()
{
	return powerL;
}

//------------------------------------------------------//
// RightDriveCalculate calculates the power of the right
// motor and then returns it as an integer.
int RightDriveCalculate()
{
	return powerR;
}
