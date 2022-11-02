package aju7_lab3;
import javax.swing.JOptionPane;

public class UnitConverter {
	public static void main(String[] args) {
		
		String first = JOptionPane.showInputDialog("please input a value and unit");
		String U = first.substring(first.indexOf(" "));
		String N = first.substring(0, first.indexOf(" "));
		int a = Integer.parseInt(N);
		
		if (U.equals(" in")) {System.out.println(first+ " = " + (a/0.03937) + " cm");}
		if (U.equals(" cm")) {System.out.println(first+ " = " + (a*0.03937) + " in");}
		if (U.equals(" m")) {System.out.println(first+ " = " + (a*1.09361) + " yd");}
		if (U.equals(" yd")) {System.out.println(first+ " = " + (a/1.09361) + " m");}
		if (U.equals(" oz")) {System.out.println(first+ " = " + (a*28.3495) + " gm");}
		if (U.equals(" gm")) {System.out.println(first+ " = " + (a/28.3495) + " oz");}
		if (U.equals(" lb")) {System.out.println(first+ " = " + (a*0.453592) + " kg");}
		if (U.equals(" kg")) {System.out.println(first+ " = " + (a/0.453592) + " lb");}

		
		
		
		
	}

}
