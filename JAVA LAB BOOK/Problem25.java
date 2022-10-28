package Closedbookjava;

public class Problem25 {
	public static void main(String[] args) {
        derived obj=new derived();
        obj.useD();
    }
}

/*protected*/ class base{//Illegal modifier for the class
    String Method(){
        return "Wow";
    }
}

class derived{
    public void useD(){
        base z=new base();
        System.out.println("Base says,"+z.Method());
    }
}

