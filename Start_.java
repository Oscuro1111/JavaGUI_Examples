

import java.lang.Thread;

@SuppressWarnings("unused")

public class Start_ extends Thread {
	private Thread creatorThread ;
	
	public Start_()
	{
		//make a note a thread that constructe me 
		creatorThread = Thread.currentThread();
	}
	
	
	public void run()
	{
		int[] arr  = {1,2,3,4,5,6,7,8,9};
		for( int i :arr )
		{
			printMsg();
		}
		
	}
	public void printMsg()
	{
		//get a reference to a therad which running this 
		Thread t = Thread.currentThread();
		
		if( t == creatorThread)
		{
			System.out.println("Creator thread !");
		}
		else if( t == this )
		{
			System.out.println(" New Thread !");
		}
		else
		{
			System.out.println(" Mystyries Thread Expected !");
		}
		
	}
	
	

}
