/**
 * Testprogram for the class "TallyCounter".
 */
 
public class P8_1_och_2_test {
	public static void main(String[] args) {
		TallyCounter tc = new TallyCounter();
		tc.setLimit(5);
		tc.count();
		tc.count();
		tc.count();
		System.out.println("Before reset: " + tc.getCount());
		
		tc.reset();
		System.out.println("After reset: " + tc.getCount());
		
		tc.count();
		tc.count();
		tc.count();
		System.out.println("Before undo: " + tc.getCount());
		
		tc.undo();
		System.out.println("After undo: " + tc.getCount());
		tc.reset();
		
		System.out.print("More than 5 counts: ");
		tc.count();
		tc.count();
		tc.count();
		tc.count();
		tc.count();
		tc.count();
	}
}
