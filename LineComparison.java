package com.javatraining;
import java.util.*;
import java.lang.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class LineComparison {
	private static final Logger LOG = LogManager.getLogger(LineComparison.class);
	double Length;
	public void length(int x1,int y1,int x2, int y2)
	{
		  Length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		  LOG.debug(Length + " Will be printed on Debug");
       	          System.out.println(Length);
		 
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		LineComparison lc=new LineComparison(); 
		lc.length(x1,y1,x2,y2);
		
	}

}
