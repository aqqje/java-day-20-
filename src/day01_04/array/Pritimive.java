package day01_04.array;
/**
 * 定义类Pritimive1,在类中定义有3个元素的boolean类型的数组t作为其成员变量。
 * 数组元素未赋值。
 * 1.定义类Array1,在Array1的main()方法中创建Pritimive对象d,
 * 2.给对象d的成员变量t赋值为{true, true, true},并输出t的三个元素值。
 * 输出其成员变量t的三个元素值。
 * @author Administrator
 *
 */
public class Pritimive {

	public static void main(String[] args) {
		Pritimive1 d = new Pritimive1();
		for(int i = 0; i < d.t.length; i++) {
			System.out.println(d.t[i]);
		}
		d.t[0] = true;
		d.t[1] = true;
		d.t[2] = true;
		for(int i = 0; i < d.t.length; i++) {
			System.out.println(d.t[i]);
		}
	}
}
class Pritimive1{
	Boolean[] t = new Boolean[3];
}
