
public class CountdownThread implements Runnable{
	
	private int countdownNum;
	
	// *****************************************************************
	// * Function Name: CountdownThread (constructor)                  *
	// * Description: Initiates CountdownThread object with a number to*
	// *                 start from.                                   *
	// * Parameter Description: int countdownNum - number to start from*
	// * Date: 7/21/25                                                 *
	// * Author: Lucy Miller                                           *
	// * References: None                                              *
	// *****************************************************************
	public CountdownThread(int countdownNum) {
		this.countdownNum = countdownNum;
	}
	
	// *****************************************************************
	// * Function Name: run (Override)                                 *
	// * Description: Code that runs when a thread for this class is   *
	// *                started (countsdown from a number every second)*
	// * Parameter Description: None                                   *
	// * Date: 7/21/25                                                 *
	// * Author: Lucy Miller                                           *
	// * References: Chapter23Notes.pptx (canvas)                      *
	// *****************************************************************
	@Override
	public void run() {
		try {
			for(int i = countdownNum; i > 0; i--) {
				System.out.println("Countdown: " + i);
				//Sleeps for 1 second
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException exception) {
			exception.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}
