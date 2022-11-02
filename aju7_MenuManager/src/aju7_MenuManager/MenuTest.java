package aju7_MenuManager;

public class MenuTest {
	public static void main(String[] args) {
		Entree E1 = new Entree("steak", "lotsa meat!!!", 20);
		Entree E2 = new Entree("SpaghEt", "SUCK TILL YA FULL", 420);

		Side SI1 = new Side("MashedTATERs", "MMMMHMHMHMHMHMHMHMHMHMH", 69);


		Salad S1 = new Salad("Fruit Salad", "Yummy Yummy", 40);
		Salad S2 = new Salad("Ceasar", "Stabbed", 40);

		Desert d1 = new Desert("Buckeyes", "Brutus haunts my dreams", 50);


		Menu M1 = new Menu("test1" , E1, null, S1, null);
		Menu M2 = new Menu ("test2", E2, SI1, S2, d1);






	}
}
