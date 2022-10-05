package JAVAPACKAGE;
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer.MyInner omi=new Outer().new MyInner();
		
		Outer.MyInnerStatic omis=new Outer.MyInnerStatic();
	}
}
class Outer{
	int i;
	static int j;
	class MyInner{
		public MyInner() {
			hai();
			System.out.println("myinner cons called..."+i+":"+j);
		}
		public void met() {
			hai();
		}
	}
	public void hai() {
		System.out.println("hai calle....");
	}
	public static void jai(MyInnerStatic my) {
		System.out.println("jai called...");
	}
	static class MyInnerStatic{
		public MyInnerStatic() {
			met(this);
			System.out.println("myinner static cons called..."+j+":");
		}
		public static void met(MyInnerStatic my) {
			jai(my);
		}
	}
}