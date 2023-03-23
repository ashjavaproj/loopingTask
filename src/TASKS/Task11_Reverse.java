
	//Write a java prog. to print print no in reverse order.
package TASKS;

public class Task11_Reverse {

	public static void main(String args[])
	{
	int num=734;
	int rev=0;
	int rem=0;

	while(num>0)
	{
	rem=num % 10;
	rev = rev *10+rem;
	num=num/10;

	}
	System.out.println("Reverse of 734 is "+rev);

	}
	}

