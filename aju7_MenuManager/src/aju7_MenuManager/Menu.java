package aju7_MenuManager;
/**
 * Class Menu
 * author : Adam Usmanov
 * created: 10/14/2022
 */

public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Desert desert;

	public Menu(String name) {
		this.name = name;
		entree = null;
		salad = null;
		side = null;
		desert = null;
	}
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = null;
		this.desert = null;
	}
	public Menu(String name, Entree entree, Side side, Salad salad, Desert desert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.desert = desert;
	}

	int totalCalories() {
		int total = 0;
		if(entree != null) {total += entree.getCalories();}
		if(side != null) {total += side.getCalories();}
		if(salad != null) {total += salad.getCalories();}
		if(desert != null) {total += desert.getCalories();}
		return total;
	}

	String description() {
		String description = "";
		if(entree==null) {description += "Entree: N/A" + "\n";}
		else {description += "Entree: " + entree.getName() + ". " + entree.getDescription()+ "\n";}
		if(salad==null) {description += "Salad: N/A" + "\n";}
		else {description += "Salad: " + salad.getName() + ". " + salad.getDescription()+ "\n";}
		if(side==null) {description += "Side: N/A" + "\n";}
		else {description += "Side: " + side.getName() + ". " + side.getDescription()+ "\n";}
		if(desert==null) {description += "Desert: N/A" + "\n";}
		else {description += "Desert: " + desert.getName() + ". " + desert.getDescription()+ "\n";}
		return description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}
