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
	public static ArrayList<MenuItem> readItems(String Fname) throws FileNotFoundException,IOException {
		
		
		File dishes = new File(Fname);
		
		ArrayList<MenuItem> ItemAL = new ArrayList<MenuItem>();
		String string = null;
		
		BufferedReader brd = 
				new BufferedReader(new FileReader(dishes));
		string = brd.readLine();
		while (string!=null) {
			String[] MenuA = string.split("@@");
			if(MenuA[1].equals("entree")) {
				Entree E1 = new Entree(MenuA[0], MenuA[2], Integer.parseInt(MenuA[3]), Double.parseDouble(MenuA[4]));
				ItemAL.add(E1);
			}
			if (MenuA[1].equals("side")) {
				Side SI1 = new Side(MenuA[0], MenuA[2], Integer.parseInt(MenuA[3]), Double.parseDouble(MenuA[4]));
				ItemAL.add(SI1);
			}
			if (MenuA[1].equals("salad")) {
				Salad S1 = new Salad(MenuA[0], MenuA[2], Integer.parseInt(MenuA[3]), Double.parseDouble(MenuA[4]));
				ItemAL.add(S1);
			}
			if (MenuA[1].equals("dessert")) {
				Dessert D1 = new Dessert(MenuA[0], MenuA[2], Integer.parseInt(MenuA[3]), Double.parseDouble(MenuA[4]));
				ItemAL.add(D1);
			}
			
			string = brd.readLine();
		}
		brd.close();
		return ItemAL;
		
	}
	public static void writeMenu(String fileName, ArrayList<Menu> menus) throws IOException {
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("These are the Menus available");
		bw.write("\n");
		for(Menu m : menus) {
			bw.write(m.description());
		}
		bw.close();
		fw.close();
		
	}
}
