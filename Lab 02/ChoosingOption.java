import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] agrs) {
		int option = JOptionPane.showConfirmDialog(null,"Do you want to chang to first class ticket?");
		
		JOptionPane.showMessageDialog(null, "you've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}
