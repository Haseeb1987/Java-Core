
public class Lion extends Carnivore{

	static int abc = 10;
	protected String procTest = "PROTECTED";
	String accessTest = "PACKAGE WILL WORK";

	public Lion(){
		System.out.println("Lion Constructor");
		abc=20;
	}

	public void LionPrint(){
		System.out.println("Lion Print Method Called");
	}

	public void Action(){
		System.out.println("Lion Action Called");
	}

	public static void main(String[]args){
		Lion L = new Lion();
//		Carnivore C = new Carnivore();
//		Animal A = new Animal();
//		System.out.println(Lion.abc);
//		Animal A1 = new Lion();
//		A1.AnimalPrint();
//		A1.Action();
//		L.Action();
//		A.Acion();
//		C.Action();
//		L.Action();
//		L.AnimalPrint();
		for (String i : args) {
			String ch = i;
			if (ch == "true")
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}


