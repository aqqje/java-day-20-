package day01_04.array;
/**
 * 从键盘读入学生万贯，找出最高分，并输出学生成绩等级。
 * score >= 最高分 -10; 等级为"A"
 * score >= 最高分 -10; 等级为"B"
 * score >= 最高分 -10; 等级为"C"
 * other             等级为"D"
 * 
 * 提示：先读入学生人数，要把人数创建int数组，存放学生成绩。
 */
import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生个数：");
		int count = sc.nextInt();
		int[] score = new int[count];
		int maxscore = score[0];
		for(int i = 0; i < score.length; i++) {
			System.out.print("\n请输入第" + (i+1) + "个学生成绩：");
			score[i] = sc.nextInt();
			if(score[i] > maxscore) {
				maxscore = score[i];
			}
		}
		System.out.println("最高成绩：" + maxscore);
		for(int i = 0; i < score.length; i++) {
			char level;
			if(score[i] >= maxscore - 10) {
				level = 'A';
			}else if(score[i] >= maxscore - 20) {
				level = 'B';
			}else if(score[i] >= maxscore - 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("第" + (i+1) + "个学生等级：" + level);
		}
	}
}




















