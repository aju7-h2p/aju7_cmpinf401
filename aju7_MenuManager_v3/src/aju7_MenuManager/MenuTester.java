package aju7_MenuManager;
/**
 * Class MenuTester
 * author : Adam Usmanov
 * created: 11/4/2022
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MenuTester{
    public static void main(String[] args) throws FileNotFoundException, IOException {
   
    	ArrayList<MenuItem> testmenu = FileManager.readItems("data/dishes.txt");
    	System.out.println(testmenu.toString());
    	
    	MenuManager manager = new MenuManager("data/dishes.txt");
    	ArrayList<Menu> menus = new ArrayList<Menu>();
    	for(int i=0; i<10; i++) {
    	    menus.add(manager.randomMenu("Menu "+i));
    	}
    	
    	FileManager.writeMenu("thisstuff.txt", menus);
    	Menu x = manager.minCaloriesMenu("diet");
    	System.out.println(x);
    	
    }
}





	
