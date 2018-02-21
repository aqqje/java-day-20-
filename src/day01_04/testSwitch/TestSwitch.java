package day01_04.testSwitch;

import java.util.Scanner;

/**
 * 从键盘分别输入2004年的"month","day"，然后得到是2004年的多少天！
 * @author Administrator
 *
 */
public class TestSwitch {

	public static void main(String[] args) {
		
		//从键盘上获得month,day
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入2004的month:");
		int month = sc.nextInt();
		System.out.println("请输入2004的day:");
		int day = sc.nextInt();
		// 记录2004年总天数
		int sum = 0; 
		
		switch (month) {
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
			sum += 28;
		case 2:
			sum += 31;
		case 1:
			sum = sum + day;
		}
		System.out.println(month + "月" + day + "日是2004年的第" + sum + "天！");
		
	}
}
