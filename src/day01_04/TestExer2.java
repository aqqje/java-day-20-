package day01_04;

import java.util.Scanner;

/**
 * 从键盘读入个数为10的整数，并判断读入的正数和负数的个数
 * @author Administrator
 *
 */
public class TestExer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = 0;
		int f = 0;
		for(int i = 1; i <= 10; i++) {
			System.err.println("请输入第" + i + "个数：");
			int k = sc.nextInt();
			if(k > 0) {
				z++;
			}
			if(k < 0) {
				f++;
			}
		}
		System.err.println("正数个数：" + z + "负数个数：" + f);
	}
}
