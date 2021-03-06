
public class Application {

  public static void main(String[] args) {
    //You may have noticed the '//' character sequence appearing on some lines of the program -- these are called comments
    //Comments are used to document your program and tell programmers reading your code what your program does and/or why you
    //did something.
    
    /*
    
      You may also have multiline comments in your Application
    
      These are denoted with the /* and * / characters. (No space between the forward slash and the asterisk)
    
    */
    
    
    //One of the most important features of Java is the ability to create variables
    //Variables are often used to represent the state of a program. ( I will elaborate in a second )
    
    /*
    
      A variable declaration in java has the following form
        
        T nameOfVariable [= initialization];
            where T is the type of variable
                  nameOfVariable is the name that the variable is identified by
                  initialization is an OPTIONAL statement which initializes the variable to a starting value
      
      Looks complicated right? Trust me, its a lot easier than I just explained it to be
        Here are a few examples:
    
    */
    
    int x = 0;
    int b = 1;
    int iAmAVariableTheNameWhichIAmRepresentedByIsExtraneouslyLongByShowsHowAVariableCanBeNamedAnything = -1;

    /*
      You can create a variable in two parts if you want
      For example:
    */
    
    int variableDeclaredInTwoSteps;
    variableDeclaredInTwoSteps = -80;

    /*
    
      One thing I should mention is that it is best to keep variable names succinct, i.e. short by descriptive
      I have broken this rule multiple times so far in this tutorial.
      Names such as 
            iAmAVariableTheNameWhichIAmRepresentedByIsExtraneouslyLongByShowsHowAVariableCanBeNamedAnything
        and variableDeclaredInTwoSteps 
      are not good variable names because they are really long and yet do not provide an adequate description of what
      they do.
      
      Variable names such as "numFish" (to represent the number of fish)
                          or "health" (to represent the health of a game character)
      are much better names because they succintly describe WHAT a variable does. If the variable
      name isn't obvious to understand then you should try to leave a comment to describe what your variable represents
      
    */

    //There are a few fundamental variables that you should know about
    
    //INTEGER: An integer is a type of "fixed point" number (fixed point refers to how it can hold only whole numbers i.e. no decimal "floating" points
    //         In java it can represent both positive and negative numbers
    int anInteger;
    
    //Here are some example declarations
    int exampleInt1 = 0;
    int exampleInt2 = 4410;
    int exampleInt3 = -79814;
    
    int exampleInt4;
    exampleInt4 = 53;
    
    //Boolean: A boolean is a value which represents a value of either "true" or "false" -- those are its only representable values
    boolean aBoolean;
    aBoolean = false;
    
    boolean aSecondBoolean = true;
    
    //DOUBLE: A double is a datatype which represents a type of floating-point number (floating point refers to how it can hold decimal points)
    double aDouble = 0.00003419;
    double aSecondDouble = 235235;
    double aThirdDouble = 234.00235;
    
    /**
        One important thing I should mention is that you can change the value of variables (hence the name) 
        For example:
    **/
    
    int p = 230;
    System.out.println(p); //Prints 230
    p = 1;
    System.out.println(p); //Prints 1
    
    //Well there you go!
    //Variables and Comments!
    
    //Next Lesson is about fundamental operations on some of the datatypes I mentioned
  }

}
