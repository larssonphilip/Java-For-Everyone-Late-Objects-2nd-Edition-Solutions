/**
 * P8.1
 * We want to add a button to the tally counter in Section 8.2 that allows an operator to undo
 * an accidental button click. Provide a method
 * public void undo()
 * that simulates such a button. As an added precaution, make sure that the operator can not click
 * the undo button more often than the count button.
 * 
 * P8.2
 * Simulate a tally counter that can be used to admit a limited number of people. 
 * First, the limit is set with a call
 *  public void setLimit(int maximum)
 * If the count button was clicked more often than the limit, simulate an alarm by
 * printing out a message “Limit exceeded”.
 */

public class TallyCounter {
	private int counter = 0;
	private int maximum = Integer.MAX_VALUE;
	
	public TallyCounter() {
	}
	
	public void count() {
		if (counter < maximum) {
			counter++;
        } else {
        		System.err.println("Limit exceeded!");
        }
	}
	
	public int getCount() {
		return counter;
	}
	
	public void reset() {
		counter = 0;
	}
	
	public void undo() {
		if(counter > 0)
			counter--;
	}

	public void setLimit(int maximum) {
		this.maximum = maximum;
	}
}
