package day01_04;

public class TestExer {

	public static void main(String[] args) {
		//3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
		int day = 0;
		for(int length = 3000;length >= 5;length/=2){
			day++;
		}
		System.out.println(day);
	}

}
