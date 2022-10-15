package aju7_MenuManager;

public class Salad {
	private String name;
	private String description;
	private int calories;
	
	public Salad(String n, String d, int c) {
		name = n;
		description = d;
		calories = c;
	}
	public Salad() {
		name = null;
		description = null;
		calories = 0;
	}
	
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
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
	

}
