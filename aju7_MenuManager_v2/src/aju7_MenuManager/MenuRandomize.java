package aju7_MenuManager;
/**
 * Class MenuRandomize
 * author : Adam Usmanov
 * created: 11/4/2022
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MenuRandomize {
	private ArrayList<Entree> entrees;
	private ArrayList<Salad> salads;
	private ArrayList<Side> sides;
	private ArrayList<Dessert> desserts;
	/**
	* Method MenuRandomize
	* @param entreeFile a string 
	* @param sideFile a String
	* @param saladFile a String
	* @param dessertFile a String
	* @return ArrayLists that have been parsed with FileManager.read------
	*/
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) throws FileNotFoundException, IOException {
		this.entrees = FileManager.readEntrees(entreeFile);
		this.salads = FileManager.readSalads(saladFile);
		this.sides = FileManager.readSides(sideFile);
		this.desserts = FileManager.readDesserts(dessertFile);
	}
	/**
	* Method randomMenu
	* @return randomly generated menu object
	*/
	public Menu randomMenu() {
		Random rand = new Random();
		int E = rand.nextInt(entrees.size());
		int Si = rand.nextInt(sides.size());
		int Sa = rand.nextInt(salads.size());
		int D = rand.nextInt(desserts.size());
		
		Menu M = new Menu(null, entrees.get(E), sides.get(Si), salads.get(Sa), desserts.get(D));
		return M;	
		
	}
		
		
	
	
	
	
	
	
}
