
public class MessageThread implements Runnable{
	
	private int duration;
	
	// *****************************************************************
	// * Function Name: MessageThread (constructor)                    *
	// * Description: Initiates object of class with a duration value  *
	// * Parameter Description: int duration - duration in seconds     *
	// * Date: 7/21/25                                                 *
	// * Author: Lucy Miller                                           *
	// * References: None                                              *
	// *****************************************************************
	public MessageThread(int duration) {
		this.duration = duration;
	}
	
	// *****************************************************************
	// * Function Name: run (Override)                                 *
	// * Description: Code that runs when a thread for this class is   *
	// *                started (prints a message and sleeps)          *
	// * Parameter Description: None                                   *
	// * Date: 7/21/25                                                 *
	// * Author: Lucy Miller                                           *
	// * References: Chapter23Notes.pptx (canvas)                      *
	// *****************************************************************
	@Override
	public void run() {
		try {
			for(int i = 0; i < duration / 2; i++) {
				System.out.println(">>> Working... ");
				//Sleep for 2 seconds
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException exception) {
			exception.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}
