package day01_04.array;

public class Select {

	public static void main(String[] args) {
		int[] arry = new int[]{1,5,77,3,1,34,3,};
		for(int i = 0; i < arry.length - 1; i++) {
			for(int j = i; j < arry.length; j++) {
				if(arry[i] > arry[j ]) {
					int temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
	}
}
