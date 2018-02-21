package day01_04;
/**
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 * @author Administrator
 *
 */
import java.util.Scanner;

public class testExer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = 0;
		int f = 0;
		for(;;) {
			int i = 1;
			System.err.println("请输入第" + i + "个数：");
			int k = sc.nextInt();
			if(k > 0) {
				z++;
			}
			else if(k < 0) {
				f++;
			}
			else {
				break;
			}
			i++;
		}
		System.err.println("正数个数：" + z + "负数个数：" + f);
	}
}
