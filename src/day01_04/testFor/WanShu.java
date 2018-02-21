package day01_04.testFor;
/**
 * 一个数如果恰好等于它 的因子之和， 这个数就称为完数。（因子：除去这个数本身正的约数）
 * 6=1+2+3 找出1000以内的所有完数
 * @author Administrator
 *
 */
public class WanShu {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			for(int j = 1; j < i; j++ ) {
				if(i % j == 0) {
					sum += j;
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
			sum = 0;
		}
	}
}
