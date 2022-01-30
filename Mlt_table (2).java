import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      int number=num.nextInt();
      System.out.print("Enter a Number upto multiplication: ");
      int end=num.nextInt();
      int i = 1,output;
      while(i <= end)
      {
        output = number*i;
        System.out.println(number+"*"+i+"= "+output);
        i++;
      }
      
	}
}
