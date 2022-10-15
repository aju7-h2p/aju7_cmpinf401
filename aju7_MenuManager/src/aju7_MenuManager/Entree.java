package aju7_MenuManager;

public class Entree {
	private String name;
	private String description;
	private int calories;
	
	public Entree(String n, String d, int c) {
		name = n;
		description = d;
		calories = c;
	}
	public Entree() {
		name = null;
		description = null;
		calories = 0;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}
	
}
