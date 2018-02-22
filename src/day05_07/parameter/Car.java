package day05_07.parameter;

public class Car {
	public static void main(String[] args){
		Car1 c1 = new Car1();
		c1.info();
		
//		c1.setName("玛莎拉蒂");
//		c1.setWheel(4);
		c1.name = "劳斯莱斯";
		c1.wheel = 6;
		
		c1.info();
		
		
		Factory f = new Factory();
		Car1 c2 = f.produceCar();
		f.describeCar(c2);
		
		Car1 c3 = f.produceCar("奥拓",4);
		f.describeCar(c3);
	}
}

class Factory{
	
	//制造车(两个方法构成重载)
	public Car1 produceCar(){
		return new Car1();
	}
	
	public Car1 produceCar(String n,int w){
		Car1 c = new Car1();
		c.name = n;
		c.wheel = w;
		return c;
	}
	//描述车的信息
	public void describeCar(Car1 c){
		c.info();
	}
}

class Car1{
	//1.属性
	String name;
	int wheel;

	//2.方法
	public void info(){
//		show();
		System.out.println("name:" + name + " wheel:" + wheel);
	}
	
	public void show(){
		System.out.println("我是一辆车");
	}
	
	public String getName(){
		return name;
	}
	
//	public void setName(String n){
//		name = n;
//	}
//	public void setWheel(int w){
//		wheel = w;
//	}
}
