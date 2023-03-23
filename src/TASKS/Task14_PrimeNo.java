
//check weather 10 is Prime no or not.

package TASKS;

public class Task14_PrimeNo {

	public static void main(String args[])
	{

	int num=1;
	int count=0;
	{ 
	for(int i=2;i<=num;i++)
	{
	if(num % i ==0)
	{
	count++;
	}
	}
	if(count<=2)
	{
	System.out.println("Is a prime no");
	}
	else
	{
	System.out.println("Not a prime no");
	}
	}

	}

	




}
