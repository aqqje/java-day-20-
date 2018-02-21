package day01_04.testIf;

import java.util.Scanner;

/**
 * 由键盘输入三个整数分别存入变量num1, num2, num3，对它们进行排序
 * （使用if-else if-else）,并且从大到小输出！
 * @author Administrator
 *
 */
public class TestIfElse {

	public static void main(String[] args) {
		//从键盘上获得三个整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入num1:");
		int num1 = sc.nextInt();
		System.out.println("请输入num2:");
		int num2 = sc.nextInt();
		System.out.println("请输入num3:");
		int num3 = sc.nextInt();
		System.out.println("大到小排序:");
		//三个整数的大小判断
		if ( num1> num2) {
			if(num3 > num1) {
				System.out.println(num3 + "," + num1 + "," + num2);
			} else if(num3 > num2) {
				System.out.println(num1 + "," + num3 + "," + num2);
			} else {
				System.out.println(num1 + "," + num2 + "," + num3);
			}
		} else {
			if(num3 > num2) {
				System.out.println(num3 + "," + num2 + "," + num1);
			} else if(num3 > num1) {
				System.out.println(num2 + "," + num3 + "," + num1);
			} else {
				System.out.println(num2 + "," + num1 + "," + num3);
			}
		}
	}
}
