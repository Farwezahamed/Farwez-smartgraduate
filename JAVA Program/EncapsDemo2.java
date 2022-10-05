package JAVAPACKAGE;

public class EncapsDemo2 {
	public static void main(String[] args) {
		Computer mycomputer=new Computer.ComputerBuilder(1000, "lowend").
				setRam("10 ram").setHardDisk("seagate").build();
		
		System.out.println(mycomputer);
	}
}
class Computer{
	 int money;
	 String config;
	 String ram;
	 String harddisk;
	public Computer(ComputerBuilder cb) {
		this.money=cb.money;
		this.config=cb.config;
		this.ram=cb.ram;
		this.harddisk=cb.harddisk;
	}
	static class ComputerBuilder{
		int money;
		String config;
		String ram;
		String harddisk;
		public ComputerBuilder(int money,String config) {
			this.money=money;
			this.config=config;
		}
		
		public ComputerBuilder setRam(String ram) {
			this.ram=ram;
			return this;
		}
		public ComputerBuilder setHardDisk(String hd) {
			this.harddisk=hd;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
	
	public String toString() {
		return "The computer is...:"+money+":"+config+":"+ram+":"+harddisk;
	}
}
