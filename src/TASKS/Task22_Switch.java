package TASKS;
import java.util.Scanner;
public class Task22_Switch {
	

	public static void main(String args[])
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	while(true)
	{
	int n=sc.nextInt();

	switch(n)
	{

	case 1:
	System.out.println("One");
	break;

	case 2:
	System.out.println("Two");
	break;

	case 3:
	System.out.println("Three");
	break;

	default:
	System.out.println("Other no");

	}
	}

	}
    }
