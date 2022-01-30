import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      int number=num.nextInt();
      int fact = 1;
      while(number >= 1)
      {
        fact = fact * number;
        number--;
      }
      System.out.println("The factorial of a num is "+ fact);
	}
}
