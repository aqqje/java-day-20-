package day01_04.testFor;
/**
 * 输出2-100之间的质数
 * @author Administrator
 *
 */
public class PrimeNumber1 {

	public static void main(String[] args) {
		Boolean flag = false;
		//获取系统当前的毫秒数
		long star = System.currentTimeMillis();
		for(int x = 2; x <= 100000; x++) {
			for(int y = 2; y < Math.sqrt(x); y++) {//**优化
				if(x % y == 0) {
					flag = true;
					break;//**优化
				}
			}
			
			if(!flag) {//**优化
				System.out.println(x);
			}
			flag = false;
		}
		long end = System.currentTimeMillis();
		System.out.println((end-star));
	}
}
