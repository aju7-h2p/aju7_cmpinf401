package aju7_MenuManager;
/**
 * Class Entree
  * author : Adam Usmanov
 * created: 10/14/2022
 */

public class Entree {
	private String name;
	private String description;
	private int calories;
	
	public Entree(String name, String description, int calories) {
		this.name = name;
		this.description = description;
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
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}
}
