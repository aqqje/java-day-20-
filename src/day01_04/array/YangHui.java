package day01_04.array;
/**
 * 使用二维数组打印一个10 行杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * ....
 * 
 * 【提示】
 * 1. 第一行有1个元素，第n行在n个元素
 * 2. 每一行的第一个元素和最后一个元素都是1
 * 3. 从第三行开始，对于非第一个元素和最后 一个元素的元素。
 * 		yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 * @author Administrator
 *
 */
public class YangHui {

	public static void main(String[] args) {
		int[][] yh = new int[10][];
		//初始化
		for(int i = 0; i < yh.length; i++) {
			yh[i] = new int[i + 1];
			for(int j = 0; j < yh[i].length; j++) {
				//首尾为1
				yh[i][0] = yh[i][i] = 1;
				//中间填数
				if(i > 1 && j > 0 && i > j) {
					yh[i][j] = yh[i-1][j-1] + yh[i-1][j];
				}
				System.out.print(yh[i][j] + "\t");
			}
			System.out.println();
		}
	}
}










