package enhancer;

import utility.Helper;

public class Enhance {
	
	public Helper helper;
	public static final String  enhance = "This is Enhance now !!!";
	
	public void setEnhance(){
		String enh = "Enhance Modified";
//		this.enhance = enh;
	}
	
	public void EnhanceAll(){
		System.out.println("" + this.enhance);
	}
}
