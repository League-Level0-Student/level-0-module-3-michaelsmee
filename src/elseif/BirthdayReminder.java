
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "october 7th";
		String dadsBirthday = "december 11th";
		String myBirthday = "june 28th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String bday = JOptionPane.showInputDialog("what birthday do you want?");
		if (bday.equals("mom")) {
			System.out.println(momsBirthday);

		}
		
	else 	if (bday.equals("dad")) {
			System.out.println(dadsBirthday);

		}
		
	else if (bday.equals("mine")) {
			System.out.println(myBirthday);

		}
		else {
		System.out.println("I do not know what you are talking about-this message with self destruct in 5-4-3-2-1 booom (big scary explosion)");	
			
		}


		
		

		
	}
	// 3. Print out what the user typed

	// 4. if user asked for "mom"
	// print mom's birthday
	// 5. if user asked for "dad"
	// print dad's birthday
	// 6. if user asked for your name
	// print myBirthday
	// 7. otherwise print "Sorry, i don't remember that person's birthday!"

}

// package extra;

// import javax.swing.JOptionPane;

// public class rollercoaster {
// public static void main(String[] args) {
// String c =JOptionPane.showInputDialog("what is your height?");
// int height=Integer.parseInt(c);
// if (height <= 48) {
// JOptionPane.showMessageDialog(null, "you need to grow,would you like to buy
// extra height for 100 robux?");}
// if (height > 48) {
// JOptionPane.showMessageDialog(null, "good job, you can pass");
// }
// }
// }