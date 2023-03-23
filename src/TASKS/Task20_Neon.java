package TASKS;

public class Task20_Neon {

	public static void main(String args[])
	{
	int n=9,s=0;
	int sq=n*n;


		while(sq>0)
	{
	int r=sq%10;
	s=s+r;
	sq=sq/10;
	}

	if (n==s)
	{
	System.out.println("Neon");

	}
	else
	{
	System.out.println("Not Neon");
	}

	}


	}


