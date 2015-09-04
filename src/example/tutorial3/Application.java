public class Application {

    public static void main(String[] args) {
    
      //Last tutorial mentioned the most common variable datatypes which will be used in Robotics 
      //(well ... mostly likely the most common at least, we will have to wait and see)
      
      int x = 3;
      boolean b = false;
      double d = 0.1;
      
      //This code prints out the values of the three variables which we just initialized
      //The '+' operator combines a String (the characters which are surrounded by quotation marks)
      //  with another string (in this case the variable - which is converted into a string) 
      System.out.println("x = " + x);
      System.out.println("b = " + b);
      System.out.println("d = " + d);
      
      /*
          Here are some simple operations for integers and doubles:
          +     -> Addition
          -     -> Subtraction, and can flip the sign of a variable
                        The statement x = -x; flips the sign of the variable -- equivalent to multiplying it by -1
          *     -> Multiplication
          /     -> Division
          
      */
    
    }

}
