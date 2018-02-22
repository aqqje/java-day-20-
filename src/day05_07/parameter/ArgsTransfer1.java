package day05_07.parameter;

public class ArgsTransfer1 {
	public static void main(String[] args) {
		ArgsTransfer1 tt = new ArgsTransfer1();
		DataSwap ds = new DataSwap();
		
		System.out.println("ds.i:" + ds.i + " ds.j:" + ds.j);
		
		tt.swap(ds);
		System.out.println(ds);
		
		System.out.println("ds.i:" + ds.i + " ds.j:" + ds.j);
		
	}
	//交换元素的值
	public void swap(DataSwap d){
		int temp = d.i;
		d.i = d.j;
		d.j = temp;
		System.out.println(d);//打印引用变量d的值
	}
}

class DataSwap{
	int i = 10;
	int j = 5;
}