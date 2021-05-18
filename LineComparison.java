package com.javatraining;
import java.util.*;
import java.lang.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class LineComparison {
	private static final Logger LOG = LogManager.getLogger(LineComparison.class);
	public double length(int x1,int y1,int x2, int y2)
	{
		  double Length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		  return Length;
		 
	}
	public void equal(Double Length1, Double Length2)
	{
		if(Length1.equals(Length2))
		{
			String message="The two lines are equal";
			LOG.debug(message + " Will be printed on Debug");
	                System.out.println(message);
		}
		else
		{
			String message="The two lines are not equal";
			LOG.debug(message + " Will be printed on Debug");
	                System.out.println(message);
		}	
	}
}
class Main
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int X1=sc.nextInt();
		int Y1=sc.nextInt();
		int X2=sc.nextInt();
		int Y2=sc.nextInt();
		
		LineComparison lc=new LineComparison(); 
		double Length1=lc.length(x1,y1,x2,y2);
		double Length2=lc.length(X1, Y1, X2, Y2);
		lc.equal(Length1,Length2);
		
	}

}
