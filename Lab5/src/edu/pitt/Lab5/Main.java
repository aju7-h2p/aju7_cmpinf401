package edu.pitt.Lab5;
import java.util.Random;
public class Main {
	public static void main (String[] args) {
		Dice roll = RollDice();
		int x = 1;
		Random random = new Random();
		for (int count = 0; count <= x; count++)
		System.out.println((random.nextInt(6)+1)+(random.nextInt(6)+1));
	
}
}
