import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      int number=num.nextInt();
      int i=1,sum=0;
      while(i <= number)
      {
         sum=sum + i;
         i++;
      }
      System.out.println("The sum of upto entered num is "+ sum);
	}
}
