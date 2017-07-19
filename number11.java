import java.io.*;
import java.util.*;
import java.lang.*;
class number11
{	
	int no,r,temp,pal=0;
	public void  input()
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of elemnts");
		no=sc.nextInt();
	}
	public void countt()
	{
		temp=no;
		while(no!=0)
		{
			r=no%10;
			pal=pal*10;
			pal=pal+r;
			no=no/10;
		}
		if(temp==pal)
		{
		System.out.println("p");
		}
		else	
		{
		System.out.println(" not p");
		}
	}
	public static void main(String args[])
	{
		number11  a = new number11();
		a.input();
		a.countt();
		
	}
}