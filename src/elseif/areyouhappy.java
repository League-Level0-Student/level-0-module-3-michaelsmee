package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {

String answer = JOptionPane.showInputDialog("Are You happy (yes or no)");
if (answer.equals("yes")) {
JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
}
else{
String answer1 = JOptionPane.showInputDialog("Do you wan to be happy");
if (answer1.equals("no")) {
JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");	
}
else {
String answer2=JOptionPane.showInputDialog("change something")	;
}
}









}
	
	
	
	
	
}

