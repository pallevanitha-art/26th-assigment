import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
      System.out.print("Enter the two numbers: ");
      int number1=num.nextInt();
      int number2=num.nextInt();
      int temp;
      temp=number1;
      number1=number2;
      number2=temp;
      System.out.println("Swap of entered numbers are "+number1+" "+number2);
        
      
	}
}
