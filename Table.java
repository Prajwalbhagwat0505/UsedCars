package Day4;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// wap to print multipilacation table
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input.nextInt();
		
		for(int i=1;i<=10;i++)   System.out.println(num*i);
	

	}

}
