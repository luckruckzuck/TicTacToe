import javax.swing.SwingUtilities;


public class AppStart {

	// Does this work?!
	
	//test
	private int bla = 1;
	
	public static void main(String[] args) {
		
		// when i change sth
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO ;
				new GameStarter();
			}
		});
	}
	
}
