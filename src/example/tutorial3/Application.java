public class Application {

	public static void main(String[] args) {

		// Last tutorial mentioned the most common variable datatypes which will
		// be used in Robotics
		// (well ... mostly likely the most common at least, we will have to
		// wait and see)

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
		
		/*
		   In addition to arithmetic datatypes,
		   the boolean datatype has some operators
		   to manipulate boolean data values
		   
		   The basic boolean operations are
		        &&    -> Performs a logical AND operation
		        ||    -> Performs a logical OR operation
		        ^     -> Performs a logical XOR operation (This is an extremely rare operator for
		                    boolean arithmetic -- feel free to skip it)
		        !     -> Performs a logical NOT operation (if value was true, makes it false. If it was false, makes it true)
		 
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
		
		/*
		
		   Last but not least -- Comparison operators:
		   	<,>         -> Greater than or Less than. Tells whether a number is greater than or less than
		   		       another number. Result is a boolean value
		   	==          -> Equals
		
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
