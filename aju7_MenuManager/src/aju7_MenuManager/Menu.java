package aju7_MenuManager;

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

	void totalCalories() {
		if(E1==null) {System.out.println( "Our calorie count is unavailable");}
		else {int z = (E1.getCalories() + S1.getCalories() + SI1.getCalories() + D1.getCalories());
		System.out.println(z);}
	}
	
	void description() {
		if(entree==null) {System.out.println( "We are not offering an Entree at this time");}
		else {System.out.println(entree.getDescription());}
		if(salad==null) {System.out.println( "We are not offering a Salad at this time");}
		else {System.out.println(salad.getDescription());}
		if(side==null) {System.out.println( "We are not offering a Side at this time");}
		else {System.out.println(side.getDescription());}
		if(desert==null) {System.out.println( "We are not offering a Desert at this time");}
		else {System.out.println(desert.getDescription());}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
		


}
