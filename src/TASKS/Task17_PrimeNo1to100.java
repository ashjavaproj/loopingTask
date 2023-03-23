package TASKS;

public class Task17_PrimeNo1to100 {

	public static void main(String args[])
	{
	for(int num=1; num<100; num++)
	{
	boolean check=true;

	for(int i=2; i<=(num-1);i++)
	{
	if (num % i==0)
	{
	check=false;
	break;
	}
	}
	if (check)
	{
	System.out.println(" " +num);
	}

	}

	}
	
}
