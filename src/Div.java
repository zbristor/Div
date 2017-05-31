import java.util.Scanner;
 
class Div {
  public static void main(String[] args) {
      int a, b, result=0;
      Scanner input = new Scanner(System.in);
      System.out.println("Input two integers");
    
      a = input.nextInt();
      b = input.nextInt();

  try{
  result = a / b;
  }
  catch(ArithmeticException e)
  {
      System.out.println("You cannot enter zero as the divisor.");
  }
  finally {
	    System.out.println("finally block will execute.");
	}
  System.out.println("Result = " + result);
  }
}