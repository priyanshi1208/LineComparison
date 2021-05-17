package com.javatraining;
import java.util.*;
import java.lang.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class LineComparison {
	private static final Logger LOG = LogManager.getLogger(App.class);
	public double length(int x1,int y1,int x2, int y2)
	{
		  double Length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		  LOG.debug(Length + " Will be printed on Debug");
	        LOG.info(Length + " Will be printed on Info");
	        LOG.warn(Length + " Will be printed on Warn");
	        LOG.error(Length + " Will be printed on Error");
	        LOG.fatal(Length + " Will be printed on Fatal");
	        LOG.info("Appending string: {}.",Length);
	        System.out.println(Length);
		  return Length;
		 
	}
	
	public void compare(double Length1, double Length2)
	{
		Double l1=new Double(Length1);
		Double l2=new Double(Length2);
		int res=l1.compareTo(l2);
		if(res>0)
		{
			String message="Length 1 is greater than Length 2";
			LOG.debug(message + " Will be printed on Debug");
	        LOG.info(message + " Will be printed on Info");
	        LOG.warn(message + " Will be printed on Warn");
	        LOG.error(message + " Will be printed on Error");
	        LOG.fatal(message + " Will be printed on Fatal");
	        LOG.info("Appending string: {}.",message);
	        System.out.println(message);
		}
		else if(res<0)
		{
			String message="Length 2 is greater than Length 1";
			LOG.debug(message + " Will be printed on Debug");
	        LOG.info(message + " Will be printed on Info");
	        LOG.warn(message + " Will be printed on Warn");
	        LOG.error(message + " Will be printed on Error");
	        LOG.fatal(message + " Will be printed on Fatal");
	        LOG.info("Appending string: {}.",message);
	        System.out.println(message);
		}
		else
		{
			String message="The two lines are equal";
			LOG.debug(message + " Will be printed on Debug");
	        LOG.info(message + " Will be printed on Info");
	        LOG.warn(message + " Will be printed on Warn");
	        LOG.error(message + " Will be printed on Error");
	        LOG.fatal(message + " Will be printed on Fatal");
	        LOG.info("Appending string: {}.",message);
	        System.out.println(message);
		}	
		
	}
	
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
		lc.compare(Length1,Length2);
		
	}

}
