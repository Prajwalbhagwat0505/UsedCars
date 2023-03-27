package Day4;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i=1,a=0,arm=0,n=0;
		System.out.println("Armstrong numbers between 1 to 500 are");
		while(i<500)
		{
		n=i;
		arm=0;
		while(n>0)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==i)
			System.out.println(i);
		i++;
		}
		}
		

	}


