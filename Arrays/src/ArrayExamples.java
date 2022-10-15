import java.lang.reflect.Array;

public class ArrayExamples {
	public static void main(String[] args) {
		
		char[] charArray = new char [5];
		charArray[0] = 'a';
		charArray[1] = 'b';
		charArray[2] = 'c';
		charArray[3] = 'd';
		charArray[4] = 'e';
		System.out.println(Array.getLength(charArray));
		System.out.println(Array.getChar(charArray, 2));
	}
	
}
