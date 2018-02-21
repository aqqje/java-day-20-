package day01_04.testFor;
/**
 * 输出2-100之间的质数
 * @author Administrator
 *
 */
public class PrimeNumber2 {

	public static void main(String[] args) {
		//Boolean flag = false;
		//获取系统当前的毫秒数
		long star = System.currentTimeMillis();
		l:for(int x = 2; x <= 1000; x++) {
			for(int y = 2; y < Math.sqrt(x); y++) {//**优化
				if(x % y == 0) {
					//flag = true;
					//break;//**优化
					continue l;
				}
			}
			
			//if(!flag) {//**优化
				//System.out.println(x);
			//}
			//flag = false;
			System.out.println(x);
		}
		long end = System.currentTimeMillis();
		System.out.println((end-star));
	}
}
