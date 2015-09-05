
public class Application {

  public static void main(String[] args) {
    //This tutorial will be about input
    
    /*
      First we need to talk about Strings
      
      A String refers to a 'string of characters'.
      For example: a word, a sentence, or just a random string of characters
      
    
      A string is very different from all of the variables which I mentioned earlier
      A string is an "Object", while all of the other variables I showed earlier are "Primitive Types"
      I will cover the full differences between Objects and Primitive types in a future tutorial
      For now just think of objects as being totally different from primitive types, and as a result, you should
         treat objects and primitives differently
    
    */
    // This is how you create a string
    String myString = "I am a string";
    
    //Objects (including strings can be created in two steps like primitives)
    String s;
    s = "Hello World!";
    
    //You can test strings for equality by using the "equals method" built into the string
    //   The equals method determines two strings to be equal if and only if the strings are the same length
    //   and contain the same characters (in the same upper/lower case) in the same order
    
    //DO NOT USE == TO COMPARE STRINGS
    boolean isEqualTest1 = "Hello World".equals("Hello World"); //true
    boolean isEqualTest2 = "Banana".equals("Pineapple"); //false
    boolean isEqualTest3 = "Ice Cream".equals("ice cream"); // false -- because string equality is case sensitive
    
    System.out.println("equal test 1 = " + isEqualTest1);
    System.out.println("equal test 2 = " + isEqualTest2);
    System.out.println("equal test 3 = " + isEqualTest3);
    
    String s0 = "Hello ";
    String s1 = "World!";
    String helloWorld = s0 + s1; //You can combine strings with the addition operator - this is called concatenation
    
    System.out.println(helloWorld); //Print a string to the console
    
    /*
    
      Now we will talk about user input!!!
    
      In order to read input from the console in java you need a Scanner object.
      In the Java standard library, a scanner object represents an object which can read and detect user input 
      
    */
    
    // This is how you create an object in java. notice that creating a variable for the object
    // looks VERY SIMILAR to the other variable declarations that I showed you earlier
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    //The original description I mentioned for what a variable declaration looked like was
    //    T variableName [= initialization];
    // The main difference with creating any variable is the variable type (java.util.Scanner is the scanner's type)
    // AND, the initialization. I will talk about how initializing objects works in a future tutorial, but for now,
    //    don't get bogged down by it. In the initialization I created a new Scanner object, and told it what input stream
    //    it should read from was (I wanted it to read from the Standard Input Stream - i.e. the console, and so I passed
    //    in the Standard Input Stream - System.in)
    
    //Submit a message in the console telling the user to enter some text 
    //(if you don't do this, then the user will just see the console block - i.e. stop doing things, and might not be sure what to do)
    System.out.print("Enter some text: ");
    //You can read strings from the command line by calling the "nextLine" method on the scanner class
    String inputString = scanner.nextLine(); // Read the next line - stops reading when the user presses the "Enter" key
    
    //Prints out what the user inputted into the console
    System.out.println("The inputted text was [" + inputString + "]");
 
    // This tells the scanner to shut down. It is important to do this. If you do not you create a 'resource leak'
    //    Resource leaks are a REALLY BIG problem in c, and c++. In java they are much rarer, however they exist sometimes
    //    when dealing with low-level (this is sometimes referred to as "native") functionality such the scanner.
    // Closing the scanner releases all of the memory which the scanner had allocated, as well as telling the Scanner
    //    to stop reading from the command line
    scanner.close();
 
    //Impressive! Isn't reading in text from the console kinda nifty ;)
    //VERY VERY SOON I will show you how to make a small program which reads a strings
    //from the console, and processes the information in order to make a small game
    
  }

}
