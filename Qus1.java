//1	"Given an integer, , perform the following conditional actions:
//If  is odd, print Weird
//If  is even and in the inclusive range of 2 to 5, print Not Weird
//If  is even and in the inclusive range of 6 to 20, print Weird
//If  is even and greater than 20, print Not Weird"

import java.util.*;
class Qus1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter number:- ");
		num = sc.nextInt();
		if(num%2!=0)
		{
			System.out.println("Weird");
		}
		else if(num%2==0 && num>=2 || num<=5)
		{
			System.out.println("Not Weird");
		}
		else if(num%2==0 && num>=6 || num<=20)
		{
			System.out.println("Weird");
		}
		else if(num%2==0 && num>20)
		{
			System.out.println("Not Weird");
		}
	}
}