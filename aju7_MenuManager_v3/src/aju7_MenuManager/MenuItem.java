package aju7_MenuManager;

public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;
	
	public MenuItem(String name, String description, int calories, double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return this.name;
	}
}
