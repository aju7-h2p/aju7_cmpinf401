package edu.pitt.lab2;
import javax.swing.JOptionPane;
public class Lab2 {

	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("What's the first length of the triangle?");
		int a = Integer.parseInt(first);
		String second = JOptionPane.showInputDialog("what is the second length of the triangle?");
		int b = Integer.parseInt(second);
		
		double c = Math.sqrt((Math.pow(a, 2))+(Math.pow(b, 2)));
		c = (100*c);
		double d = (int)Math.round(c);
		d = d/100;
		
		JOptionPane.showMessageDialog(null, d, "the hypotenuse is,", JOptionPane.PLAIN_MESSAGE);

	}

}
