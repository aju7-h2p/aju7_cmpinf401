package aju7_MenuManager;
/**
 * Class MenuTester
 * author : Adam Usmanov
 * created: 11/4/2022
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public class MenuTester{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
            "data/sides.txt","data/salads.txt","data/desserts.txt");
        Menu myMenu = randomize.randomMenu();
        System.out.println(myMenu.description()+"\nTotal calories"+
                            myMenu.totalCalories());
    }
}





	
