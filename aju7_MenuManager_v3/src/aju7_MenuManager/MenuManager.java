package aju7_MenuManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Salad> salads;
	private ArrayList<Side> sides;
	private ArrayList<Dessert> desserts;
	
	public MenuManager(String dishesFile) throws FileNotFoundException, IOException {
		entrees = new ArrayList<Entree>();
		salads = new ArrayList<Salad>();
		sides = new ArrayList<Side>();
		desserts = new ArrayList<Dessert>();
		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);
		for(MenuItem item : items) {
			if(item instanceof Entree) {
				entrees.add((Entree) item);
			}
			if(item instanceof Salad) {
				salads.add((Salad) item);
			}
			if(item instanceof Side) {
				sides.add((Side) item);
			}
			if(item instanceof Dessert) {
				desserts.add((Dessert) item);
			}
		}
	}
	public Menu randomMenu(String name) {
		Random rand = new Random();
		int E = rand.nextInt(entrees.size());
		int Si = rand.nextInt(sides.size());
		int Sa = rand.nextInt(salads.size());
		int D = rand.nextInt(desserts.size());
		
		Menu M = new Menu(name, entrees.get(E), sides.get(Si), salads.get(Sa), desserts.get(D));
		return M;	
		
	}
	public Menu minCaloriesMenu(String name) {
		Entree e = entrees.get(0);
		for (Entree entree : entrees) {
			int cal = entree.getCalories();
			if (cal < e.getCalories()) {
				e = entree;
			}
		}
		Salad s = salads.get(0);
		for (Salad salad : salads) {
			int cal = salad.getCalories();
			if (cal < s.getCalories()) {
				s = salad;
			}
		}
		Side si = sides.get(0);
		for (Side side : sides) {
			int cal = side.getCalories();
			if (cal < si.getCalories()) {
				si = side;
			}
		}
		Dessert d = desserts.get(0);
		for (Dessert dessert : desserts) {
			int cal = dessert.getCalories();
			if (cal < d.getCalories()) {
				d = dessert;
			}
		}
		return new Menu(name, e, si, s, d);
	} 
	public Menu maxCaloriesMenu(String name) {
		Entree e = entrees.get(0);
		for (Entree entree : entrees) {
			int cal = entree.getCalories();
			if (cal > e.getCalories()) {
				e = entree;
			}
		}
		Salad s = salads.get(0);
		for (Salad salad : salads) {
			int cal = salad.getCalories();
			if (cal > s.getCalories()) {
				s = salad;
			}
		}
		Side si = sides.get(0);
		for (Side side : sides) {
			int cal = side.getCalories();
			if (cal > si.getCalories()) {
				si = side;
			}
		}
		Dessert d = desserts.get(0);
		for (Dessert dessert : desserts) {
			int cal = dessert.getCalories();
			if (cal > d.getCalories()) {
				d = dessert;
			}
		}
		return new Menu(name, e, si, s, d);
	} 
	
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}
	public ArrayList<Salad> getSalads() {
		return salads;
	}
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}
	public ArrayList<Side> getSides() {
		return sides;
	}
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
	
	
	
}
