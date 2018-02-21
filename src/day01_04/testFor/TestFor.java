package day01_04.testFor;
/**
 * 从1循环到150并在每行打印一个值，
 * 另外在每个3 的位数行上打印出"foo",在每个5的位数行上打印"biz",
 * 在每个7的位数行上打印输出"baz".
 * @author Administrator
 *
 */
public class TestFor {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 150; i++) {
			System.out.print(i);
			if(i % 3 == 0) {
				System.out.print("-foo");
			}
			if(i % 5 == 0) {
				System.out.print("-biz");
			}
			if(i % 7 == 0) {
				System.out.print("-baz");
			}
			System.out.println();
		}
	}
}
