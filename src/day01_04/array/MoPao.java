package day01_04.array;
/**
 * 冒泡排序
 * @author Administrator
 *
 */
public class MoPao {

	public static void main(String[] args) {
		int[] arry = new int[]{1,5,77,3,1,34,3,};
		for(int i = 0; i < arry.length - 1; i++) {
			for(int j = 0; j < arry.length - 1 - i; j++) {
				if(arry[j] > arry[j + 1]) {
					int temp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
	}
}
