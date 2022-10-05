package JAVAPACKAGE;
public class ThisDemo2 {
	public static void main(String[] args) {
		Food food=new Food(10);
		System.out.println(food.giveChange());
		food.distributeFood();
	}
}
class Food{
	int m;
	public Food(int m) {
		this.m=m;
	}
	public int giveChange() {
		int change=m-5;
		return change;
	}
	
	public void distributeFood() {
		new Orphanage().acceptFood(this);
	}
}
class Orphanage{
	public void acceptFood(Food food) {
		System.out.println(food);
	}
}