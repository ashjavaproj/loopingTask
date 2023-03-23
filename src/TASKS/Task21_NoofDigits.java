package TASKS;

public class Task21_NoofDigits {

	public static void main(String args[])
	{

	int n=610143;

	int count=0;

	while(n>0)
	{
	//int d=n%10;

	n=n/10;
	count++;
	//n=n/10;
	}

	System.out.print(count+" Digits");

	}


	}

