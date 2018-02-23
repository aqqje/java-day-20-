package day10_11;

interface Product{
	public int getPrice();
	public String getName();
}
public class AnonymousTest{
	public void test(Product p){
		System.out.println("购买了一个" + p.getName() + "，花掉了" + p.getPrice());
	}
	public static void main(String[] args) {
		AnonymousTest ta = new AnonymousTest();
		//调用test方法时，需要传入一个Product参数，
		//此处传入其匿名实现类的实例
		ta.test(new Product(){
			public int getPrice(){
				return 567;
			}
			public String getName(){
				return "AGP显卡";
			}
		});
	}
}
