//2	Check String is Palindrom or not.

import java.util.Scanner;
class Qus2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String reverseStr = "";
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
    
		int strLength = str.length();

		for (int i = (strLength - 1); i >=0; --i) 
		{
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) 
		{
			System.out.println(str + " is a Palindrome String.");
		}
		else 
		{
			System.out.println(str + " is not a Palindrome String.");
		}
	}
}