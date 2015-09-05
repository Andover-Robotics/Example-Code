
public class Application {

  public static void main(String[] args) {
    //In this tutorial I will show you a few fundamental control structures, including
    //      if, else if, else
    //      while loops
    //as well as functions
    
    //By the end of this tutorial, I will switch the focus of the tutorials from being mostly informational
    //  to being project based learning, i.e. the next tutorials will be projects, with me introducing more concepts
    //  in each project
    
    /*An if statement is a branching control structure
      It allows your program to run different code based on a condition
      It has the following form:
      
        if(booleanCondition) {
           //code executed if condition is true
           //The code which is in the if statement is surrounded by the "curly brackets- { }"
        } [else if (booleanCondition2) {
           //code to execute if booleanCondition1 is NOT true, and if booleanCondition2 is true
           //The code in the else if statement is surrounded by the curly brackets
        }] [ else {
           //Code to execute if neither condition is true
           //Code which is executed is surrounded by curly brackets
        }]
    */
    
    //Here are a few examples:
    if (0 < 8) { //The boolean condition is true
      //Therefore, the following code will execute
      System.out.println("In the if statement");
    } else if (0 > -1) { //This is true
      //BUT this will not execute because the initial if statement was true
      //This only executes when the initial if statement was false
      System.out.println("In the else if statement");
    } else {
      //One of the conditions was true, thus this is not executed
      System.out.println("In the else statement");
    }
    
    //Example 2
    if (1 > 1) { //The condition is false
      //Therefore, this code block is NOT executed
      System.out.println("1 > 1");
    } else if (0 < 1) { //This is true
      //Therefore, this code block is executed
      System.out.println("0 < 1");
    } //You don't need an else statement
    
    //Example 3
    boolean isTodaySaturday = true;
    if (!isTodaySaturday) {
      //Executes if today is NOT saturday
      System.out.println("ITS NOT SATURDAY :O");
    } else { //This condition is called if it is NOT (NOT Saturday)
      //I.e. it is saturday
      System.out.println("Saturday :)))))");
    }
    
    //Example 4
    int temperature = 90; //Farenheight
    boolean hasAirConditioningtrue;
    boolean isIndoors =  true;
    
    if (hasAirConditioning && isIndoors) {
      temperature = 70; //Indoor temperature in hot weather is lower than the outside temperature
    } //Don't need an else statement
    
    
    /*
        While loop:
          A loop is used when you want to repeat a section of code
          multiple times
          
          it has the form
            whlie (booleanCondition) {
              //Executes the loop while the boolean condition is true
            }
    */
    
    //Here is an example
    int numApples = 0; //Number of apples
    
    while (numApples < 30) {
      System.out.println("*Computer gives apple to you*");
      System.out.println("YAY! Apples!");
      numApples++;
    }
    //At this point the console will have executed the above condition 30 times.
      // numApples would be equal to 30
      // and the console would have printed out the above two messages 30 times each
  
    int x = 0;
    while (x % 40 == 0 && x % 67 == 0) { //This loop will run until it finds the first number divisible by 40 and 67
      x++;
    }
    System.out.println("The first number divisible by 40 & 67 is " + x);
    
    //Next section will be on functions/methods
  }

}
