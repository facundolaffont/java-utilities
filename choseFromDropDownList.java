import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * Creates a message dialog and lets the user choose from a list of values.
 *
 * @param message Message used to guide the user about the content to be chosen.
 * @param title The title of the message dialog window.
 * @param icon The icon of the window. If there is no icon, use null as argument.
 * @param dropDownList The list of items to chose from.
 * @return The element chosen from the list.
 */
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
