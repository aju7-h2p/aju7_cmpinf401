package aju7_MenuManager;
/**
 * Class FileManager
 * author : Adam Usmanov
 * created: 11/4/2022
 */
import java.io.*;
import java.util.ArrayList;

public class FileManager {
	/**
	* Method readDesserts
	* @param Fname a string linking to a file with dessert information
	* @return ArrayList comprised of Dessert objects parsed from file information
	*/
	public static ArrayList<Dessert> readDesserts(String Fname) throws FileNotFoundException,IOException {
		File dessert = new File(Fname);
		
		ArrayList<Dessert> dessertAL = new ArrayList<Dessert>();
		String string = null;
		
		BufferedReader brd = 
				new BufferedReader(new FileReader(dessert));
		string = brd.readLine();
		while (string!=null) {
			String[] dessertA = string.split("@@");
			Dessert d1 = new Dessert(dessertA[0], dessertA[1], Integer.parseInt(dessertA[2]));
			dessertAL.add(d1);
			string = brd.readLine();
		}
		brd.close();
		return dessertAL;
		
	}
	/**
	* Method readEntrees
	* @param Fname a string linking to a file with dessert information
	* @return ArrayList comprised of Dessert objects parsed from file information
	*/
	public static ArrayList<Entree> readEntrees(String Fname) throws FileNotFoundException,IOException {
		File entree = new File(Fname);
		
		ArrayList<Entree> entreeAL = new ArrayList<Entree>();
		String string = null;
		
		BufferedReader brd = 
				new BufferedReader(new FileReader(entree));
		string = brd.readLine();
		while (string!=null) {
			String[] entreeA = string.split("@@");
			Entree e1 = new Entree(entreeA[0], entreeA[1], Integer.parseInt(entreeA[2]));
			entreeAL.add(e1);
			string = brd.readLine();
		}
		brd.close();
		return entreeAL;
		
	}
	/**
	* Method readSides
	* @param Fname a string linking to a file with dessert information
	* @return ArrayList comprised of Dessert objects parsed from file information
	*/
	public static ArrayList<Side> readSides(String Fname) throws FileNotFoundException,IOException {
		File side = new File(Fname);
		
		ArrayList<Side> sideAL = new ArrayList<Side>();
		String string = null;
		
		BufferedReader brd = 
				new BufferedReader(new FileReader(side));
		string = brd.readLine();
		while (string!=null) {
			String[] sideA = string.split("@@");
			Side SI1 = new Side(sideA[0], sideA[1], Integer.parseInt(sideA[2]));
			sideAL.add(SI1);
			string = brd.readLine();
		}
		brd.close();
		return sideAL;
	}
	/**
	* Method readSalads
	* @param Fname a string linking to a file with dessert information
	* @return ArrayList comprised of Dessert objects parsed from file information
	*/
	public static ArrayList<Salad> readSalads(String Fname) throws FileNotFoundException,IOException {
		File salad = new File(Fname);
		
		ArrayList<Salad> saladAL = new ArrayList<Salad>();
		String string = null;
		
		BufferedReader brd = 
				new BufferedReader(new FileReader(salad));
		string = brd.readLine();
		while (string!=null) {
			String[] saladA = string.split("@@");
			Salad S1 = new Salad(saladA[0], saladA[1], Integer.parseInt(saladA[2]));
			saladAL.add(S1);
			string = brd.readLine();
		}
		brd.close();
		return saladAL;
		
	}
}
