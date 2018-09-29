//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot robot=new Robot();
		//3. Ask the user what color they would like the robot to draw
for(int i=0;i<10;i++) {
		String color =JOptionPane.showInputDialog("what would you like the robot to draw").toLowerCase();
		//5. Use an if/else statement to set the pen color that the user requested
			 if (color.equals("red") ) {
				 robot.setPenColor(200,0,0);
			 }
			 if (color.equals("blue")) {
				 robot.setPenColor(0,0,200); 
			 }
			 if (color.equals("green")) {
				robot.setPenColor(0,200,0); 
			 }
        //6. If the user doesn’t enter anything, choose a random color
			 if (color.equals("")) {
			robot.setRandomPenColor();
			 }
				 
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
	robot.setSpeed(15);	
	robot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
       robot.penDown();
       for(int j=0;j<4;j++)   {
       robot.move(100);
       robot.turn(90);
       }
}
	}
}
