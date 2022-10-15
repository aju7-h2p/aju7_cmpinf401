package aju7_MenuManager;

public class Desert {
	private String name;
	private String description;
	private int calories;
	
	public Desert(String n, String d, int c) {
		name = n;
		description = d;
		calories = c;
	}
	public Desert() {
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
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	

}
