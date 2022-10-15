package edu.pitt.lab2;
import javax.swing.JOptionPane;
public class Lab2 {

	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("What's the first half my guy?");
		int a = Integer.parseInt(first);
		String second = JOptionPane.showInputDialog("how about that second half bruh?");
		int b = Integer.parseInt(second);
		
		double c = Math.sqrt((a^2)+(b^2));
		 JOptionPane.showMessageDialog( " The hypotenuse is, " + c );

	}

}
