package day01_04.array;

public class GetSum {

	public static void main(String[] args) {
		int[][] m = new int[][]{{3,4,5},{4,5,6},{14,64},{3},{3,5,6,7,}};
		int sum = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
				sum += m[i][j];
			}
			System.out.println();
		}
		System.out.println("sum:" + sum);
	}
}
