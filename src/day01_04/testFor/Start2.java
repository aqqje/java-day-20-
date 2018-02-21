package day01_04.testFor;
/*
*
**
***
****
*****
*****
****
***
**
*
 */
public class Start2 {

	public static void main(String[] args) {
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++ ) {//for(int j = 0; j < 5-i; j++)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
