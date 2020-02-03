package utility;

import enhancer.Enhance;

public class Helper {
	public static final String constTest = "STATIC";
	
	public Helper (){
		System.out.println("Helper Constructor");
	}
	
	public void HelpingStuff (){
		System.out.println("This is a Helper Class");
	}
	
	public void HelperImp (){
		Enhance e = new Enhance();
		e.EnhanceAll();
	}
	
	public static <G> void returnArray (G... inArray){
		for (G element : inArray){
			System.out.println(element);
		}
	}
}
