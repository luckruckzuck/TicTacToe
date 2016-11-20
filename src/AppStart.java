import javax.swing.SwingUtilities;


public class AppStart {

	// WHY IS THIS NOT WORKING`?
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
