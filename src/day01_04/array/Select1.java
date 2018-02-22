package day01_04.array;

public class Select1 {
	
	public static void main(String[] args) {
		int[] arry = new int[]{1,5,77,3,1,34,3,};
		for(int i = 0; i < arry.length - 1; i++) {
			int t = i;
			for(int j = i; j < arry.length; j++) {
				if(arry[t] > arry[j]) {
					t = j;
				}
			}
			if(t != i) {
				int temp = arry[t];
				arry[t] = arry[i];
				arry[i] = temp;
			}
		}
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
	}
}
