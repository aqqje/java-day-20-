package day01_04.testFor;
/*
 * 
 **
 ***
 ****
 */
public class Start {

	public static void main(String[] args) {
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
