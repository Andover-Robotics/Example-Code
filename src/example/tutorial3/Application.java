public class Application {

	public static void main(String[] args) {

		// Last tutorial mentioned the most common variable datatypes which will
		// be used in Robotics

		//Examples
		int x = 3;
		boolean b = false;
		double d = 0.1;

		// This code prints out the values of the three variables which we just
		// initialized
		// The '+' operator combines a String (the characters which are
		// surrounded by quotation marks)
		// with another string (in this case the variable - which is converted
		// into a string)
		System.out.println("x = " + x);
		System.out.println("b = " + b);
		System.out.println("d = " + d);

		/*
		 * Here are some simple operations for integers and doubles: 
		   
		   + -> Addition 
		   
		   - -> Subtraction, and can flip the sign of a variable The
		   statement x = -x; flips the sign of the variable -- equivalent to
		   multiplying it by -1 
		   
		   * -> Multiplication 
		   
		   / -> Division 
		   
		   % -> Modulus, calculates the remainder of a division operation
		 */

		// Examples
		int h = x * x + x; // Sets h equal to 12

		System.out.println("h = " + h);

		double hypotenuse = Math.sqrt(3 * 3 + 4 * 4);
		// Calculates the hypotenuse of a triangle with sides 3 and 4.
		// the value of hypotenuse is approximately equal to 5, but 
		// occasionally, it might not be exactly accurate (as an example, it could be 5.00000000001, or a similar number)

		System.out.println("hypotenuse = " + hypotenuse);

		int g = 54 % 3;
		// Calculates the remainder of the division 54/3. Because 54/3 equals 18
		// with a remainder of 0
		// g is equal to 0

		System.out.println("g = " + g);

		int y0 = 3 % 2; // sets y0 equal to 1 (3 / 2 yields 1 with a remainder
						// of 1)

		System.out.println("y0 = " + y0);

		double i0 = 3. % 0.5; 
		// sets i0 approximately equal to 0. Like floating point division, Modulus can produce rounding errors
		// occasionally, thus it might not be exactly accurate (as an example, it could be 0.00000000001, or a similar number)

		System.out.println("i0 = " + i0);

// 		int z = 5 / 0;
		// This will result in a RUNTIME error. I.e. if you were to run this
		// file, you would get an
		// Arithmetic error for dividing by 0
		// If you would like to test it out, then run the file after
		// uncommenting the above declaration of z

		double u = 5. / 0.;
		// This will set u to be equal to Double.POSITIVE_INFINITY -- don't
		// worry to much about why this is
		// just realize that dividing a floating point number by 0 will NOT
		// throw a runtime error, but will instead
		// set it equal to positive / negative infinity (depending on the sign
		// of the numerator)

		System.out.println("u = " + u);

// 		int q = 5 % 0; 
		//Throws exception -- same as integer division by 0

		double w = 5. % 0.;
		// Sets value to Double.NaN -- NaN stands for "Not a Number" -- it is
		// the return type
		// of non-sensical operations such as Math.sqrt(-1) and modulus'ing by 0

		System.out.println("w = " + w);
		
		//Try playing around with some of the basic arithmetic operators until you feel comfortable with how they work
		//For the most part, they behave just as you would expect (excluding the divide/mod by 0 behavior)
		
		/* There are also arithmetic operators which are often used to change the vlaue of a variable
		
			The following are the counter parts of the previously mentioned arithmetic operators
			+=
			-=
			*=
			/=
			%=
		
			Here are some examples of how they are used
		*/
		
		int f = 0;
		f += 1; //Sets f to the value of (f+1) -- 1
		f *= 2; //Sets f to the value of (f*2) -- 2
		f *= 23; //f = f*23 -> 46
		f /= 10; //f = f/10 --> 4
		f %= 3; //f = f%3 --> 1
		System.out.println("f = " + f);
		
		// There are two more small operators
		// ++      --
		
		int r0 = 0;
		r0++; //same as r0 = r + 1; or r0 += 1;
		r0--; //same as r0 = r - 1; or r0 -= 1;
		
		//For now, remember to put the ++, or -- AFTER the variable
		//	Note that ++r0 is DIFFERENT from r0++
		//	Just to standardize things I will only be using the form r0++,
		//      I.e. putting the operator after the variable
		
		/*
		   In addition to arithmetic datatypes,
		   the boolean datatype has some operators
		   to manipulate boolean data values
		   
		   The basic boolean operations are
		        &&    -> Performs a logical AND operation
		        ||    -> Performs a logical OR operation
		        !     -> Performs a logical NOT operation (if value was true, makes it false. If it was false, makes it true)
		        ^     -> Performs a logical XOR operation (This is an extremely rare operator for
		                    boolean arithmetic, but it is useful to know what it is)

		   The behavior of each of these operators may be summarized in the following way
		   
		   Logical AND (&&) is true when boolean1 is true AND boolean2 is true
				true && true -> true
		   		false && true -> false
		   		true && false -> false
		   		false && false -> false
		   	
		   Logical OR (||) is true when either boolean1 is true OR boolean2 is true
			        true || true -> true
		        	false || true -> true
		        	true || false -> true
			        false || false -> false
		   
		   Logical XOR (^) is true when both input are different
		   		true ^ true -> false
		   		false ^ true -> true
	   	   		true ^ false -> true
		   		false ^ false -> false
		 */

		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 && b2 = " + (b1 && b2)); //prints false
		System.out.println("b1 || b2 = " + (b1 || b2)); //prints true
		System.out.println("b1 ^ b2 = " + (b1 ^ b2)); //prints true
		
		System.out.println("b1 && b1 = " + (b1 && b1)); //prints true
		System.out.println("b1 || b1 = " + (b1 || b1)); //prints true
		System.out.println("b1 ^ b1 = " + (b1 ^ b1)); //prints false
		
		System.out.println("b2 && b2 = " + (b2 && b2)); //prints false
		System.out.println("b2 || b2 = " + (b2 || b2)); //prints false
		System.out.println("b2 ^ b2 = " + (b2 ^ b2)); //prints false
		
		System.out.println("!b1 = " + !b1); //prints false
		System.out.println("!b2 = " + !b2); //prints true

		//Some example boolean operations
		//===========================================================================//
		
		boolean isBusySaturday = false;
		
		//Represents the hour of the showing in international time.  I.e. hours 0 to 12 are
		//	the AM hours, hours between 12 and 24 are PM hours. 16 is 4 in the afternoon
		int hourOfShowing = 16; 
		
		//Represents whether you are available to go to the movies on saturday
		//You can only go if you are not busy AND if the hour of showing is between noon and 10 PM
		boolean availableForTheMovies = (!isBusySaturday && hourOfShowing >= 12 && hourOfShowing <= 22);
		//availableForTheMovies is true, because all conditions are met
		
		//===========================================================================//
		
		/*
		
		   I mentioned some comparison operators in the last few examples, but here is an overview:
		   	<,>         -> Greater than or Less than. Tells whether a number is greater than or less than
		   		       another number. Result is a boolean value
				Ex: 2 > 2 is false
				    3 > 1 is true
				    1 > 3 is false

		   	==          -> Equals
		   		Ex: 2 == 2 is true
		   		    4 == 3 is false

		   	<=,>=       -> Less than or equal to, greater than or equal to
		   		Ex: 2 <= 4 is true
		   		    3 <= 3 is true
		   		    4 <= 3 is false
		   		    
		   		    6 >= 5 is true
		   		    6 >= 6 is true
		   		    6 >= 7 is false
		   		    
			!=          -> NOT equals
				Ex: 2 != 2 is false
				    4 != 3 is true
		*/
		
		boolean bool1 = (4 > 0); //4 IS greater than 0 --> true
		
		boolean bool2 = (-1 < 0 && -1 > -4); //-1 IS less than 0, AND -1 IS greater than -4 --> true
		
		boolean bool3 = (5 < 10 ^ (-1 > 0 || 2 > 8)); 
		//true 5 < 10 is true, and the expression (-1 > 0 || 2 > 8) is false.
		//simplifying this yields (true ^ false), and so, because both booleans are NOT equal to each other, this is true
		
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		System.out.println("bool3 = " + bool3);
		
		//Those were the operators on some of the fundamental datatypes
		//Next section is about user input
	}

}
