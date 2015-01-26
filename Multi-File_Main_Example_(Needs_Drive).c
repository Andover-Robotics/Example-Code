#pragma config(Hubs,  S4, HTMotor,  none,     none,     none)
#pragma config(Sensor, S4,     ,               sensorI2CMuxController)
#pragma config(Motor,  mtr_S4_C1_1,     leftWheel,     tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S4_C1_2,     rightWheel,    tmotorTetrix, openLoop, reversed)

//

/*
-------------- Multi-file Code Example, MDQ 1/25/2015 ---------------------------------------
_____________________________________________________________________________________________
| This is an example of how you can use multiple files when creating your source code.      |
| This is useful when trying to sort and compartmentalize code. It also lets multiple       |
| people work on the code at the same time as multiple people can be dealing with multiple  |
| files. To do so, use #include "<filename>". This gives the main file access to all of     |
| the included file's variables and subroutines, but not the other way around.              |
|                                                                                           |
| In this example, subroutines for driving are kept in another file, Drive.c. Drive.c       |
| is included and it's subroutines and variables called for demonstration.                  |
|___________________________________________________________________________________________|
*/
//-------------- Variables, Includes, Runtime Windows ----------------//
#pragma debuggerWindows("joystickSimple");				// Open joystick window durring runtime
#include "Drive.c"                            		// Include routines and variable for driving

int L = 0;
int R = 0;

//-------------- Main --------------//
task main()
{
	while(1) 																				// Begin infinite loop
	{

		drive(L, R);																	// Run driving routine from Drive.c

		motor[leftWheel] = powerL;      							// Set left motor power to variable from Drive.c
		motor[rightWheel] = powerR;     							// Set right motor power to variable from Drive.c

		motor[leftWheel] = LeftDriveCalculate();			// Set left motor power to output of a procedure in Drive.c
		motor[rightWheel] = RightDriveCalculate();		// Set right motor power to output of a procedure in Drive.c
	}
}
