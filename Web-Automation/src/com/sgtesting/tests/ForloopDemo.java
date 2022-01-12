package com.sgtesting.tests;

import org.apache.log4j.Logger;

public class ForloopDemo {
	public static Logger Log=Logger.getLogger("Testing Log");
	
	public static void main(String[] args) {
		dispalyLogs();

	}

	private static void dispalyLogs()
	{
		Log.info(" for Loop Execution statrted here......");
		Log.info(" for Loop Execution statrted here......");
		Log.info(" for Loop Execution statrted here......");
		Log.info(" for Loop Execution statrted here......");
		Log.info(" for Loop Execution statrted here......");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				Log.info("Even number :"+i);
			}
		}
		Log.info("for loop Execution Ended here....");
	}

}
