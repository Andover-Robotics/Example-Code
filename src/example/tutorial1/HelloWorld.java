//This is a simple program which will print "Hello World!" in the console

//For now ignore what a class is - I will review what it is in a later tutorial
public class Application {

  // This is the main method. When you run this program the main method is ALWAYS*
  //    where your program starts.
  // This method takes one argument - an array of strings representing the program arguments
  // You can pass arguments to your program from the command line or (if you are running your file from an IDE)
  //    you can specify program arguments from your Run Configurations settings
  // By default - the array of arguments is empty
  //
  // *in standard java -- its different for Android Java development - which we will be using for Robotics, but I will
  //  talk about how it works for Android in a later tutorial
  public static void main(String[] args) {
    
    //This line of code prints the text "Hello World!" to the screen
    //println is a function which prints the text to the screen, and then moves onto the next line
    //println stands for "print line"
    System.out.println("Hello World!");
    System.out.println("Hello World Again!");
    
    //another function called print simply prints text to the screen without moving onto the next line.
    //Consider the difference between the previous print statements and the following
    System.out.print("Hello World!");
    System.out.print("Hello World Again!");
    
    //Notice how both print statements are on the same line in the second segment of print statements?
  }

}
