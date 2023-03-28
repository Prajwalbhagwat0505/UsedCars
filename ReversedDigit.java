package Day4;
import java.util.Scanner;
public class ReversedDigit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=input.nextInt();
		while(number!=0)
		{
			System.out.print(number%10);
		
			number=number/10;
		}
	    
			}

}
