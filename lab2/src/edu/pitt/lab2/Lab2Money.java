package edu.pitt.lab2;
import javax.swing.JOptionPane;
public class Lab2Money {
	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("Please input a sum of money between 1 and 9999 dollars");
		int d = Integer.parseInt(first);
		int g = d/1000;
		int B = (d%1000)/100;
		int s = (d%100)/10;
		int b = (d%10)/1;
		
		System.out.println("you have " + g + " grands ");
		System.out.println("you have " + B + " Benjamins");
		System.out.println("you have " + s + " sawbucks");
		System.out.println("you have " + b + " bucks");
		
	}
}
