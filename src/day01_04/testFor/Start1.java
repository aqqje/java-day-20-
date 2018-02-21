package day01_04.testFor;
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */
public class Start1 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int x = 0; x < 4 - i; x++) {
				System.out.print(" ");
			}
			for(int y = 0; y < i + 1; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 0; i < 4; i++) {
			for(int x = 0; x < i + 1; x++) {
				System.out.print(" ");
			}
			for(int y = 0; y < 4 - i; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
