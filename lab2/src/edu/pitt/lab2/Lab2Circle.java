package edu.pitt.lab2;
import javax.swing.JOptionPane;
public class Lab2Circle {
	public static void main(String[] args) {
		
		String first = JOptionPane.showInputDialog("What is the radius of the circle?");
		double r = Integer.parseInt(first);
		double a = (2*Math.PI*r);
		a *= 100;
		double C = (int)Math.round(a);
		C /= 100;
		
		double b = (Math.PI*r*r);
		b *= 100;
		double A = (int)Math.round(b);
		A /= 100;
		
		String s = ("a circle of radius " + r + " has perimeter " + C + " and area " + A );
		
		System.out.println(s);
		
	}
}
