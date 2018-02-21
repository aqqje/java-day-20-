package day01_04.testFor;
/**
 * 输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
 * 153 = 1*1*1 + 3*3*3 + 5*5*5
 * @author Administrator
 *
 */
public class TestFor2 {
	
	public static void main(String[] args) {
		
		for(int i = 100; i <= 999; i++ ) {
			//百位
			int j1 = i / 100;
			//十位
			int j2 = (i - j1*100)/10;
			//个位
			int j3 = i % 10;
			if((j1*j1*j1 + j2*j2*j2 + j3*j3*j3) == i) {
				System.out.println(i);
			}
		}
	}
}
