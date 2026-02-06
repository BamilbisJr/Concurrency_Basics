//*****************************************************************                                               *
//* File: ThreadApp.java                                          *
//* Author: Lucy Miller                                           *
//* Last Update Date: 7/21/25                                     *
//* Version 1                                                     *
//*****************************************************************

public class ThreadApp {
	public static void main(String[] args) {
		
		//Create object instances of CountdownThread and MessageThread with same value
		CountdownThread countdown = new CountdownThread(5);
		MessageThread working = new MessageThread(5);
		
		//Convert objects into thread type to allow start() and join()
		Thread cdThread = new Thread(countdown);
		Thread work = new Thread(working);
		
		//Start both threads
		cdThread.start();
		work.start();
		
		try {
			//Waits for threads to finish or interrupt
			cdThread.join();
			work.join();
		}
		catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		
		System.out.println("\nThreads complete");
	}
}
