import java.util.ArrayList;
import javax.swing.ImageIcon;

public String choseFromDropDownList(String message, String title, ImageIcon icon, ArrayList<String> dropDownList) {
	return (String) JOptionPane.showInputDialog(
		null,
		message,
		title,
		JOptionPane.QUESTION_MESSAGE,
		icon,
		dropDownList.toArray(),
		null
	);
}
