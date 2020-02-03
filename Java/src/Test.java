import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utility.Helper;


public class Test {
	
	byte a = 0;
	short b = 0;
	int c = 0;
	long d = 0l;
	float f = 0.0f;
	double g = 0.0d;
	boolean h = false;
	char i = 'A';
	String j = "This is class string";
	Integer k = 10;
	Number l = 20;
	Character ch = new Character ('A');
	int [] intArray = new int [c];
	enum TestingEnum {Test1,Test2, Test3, METHOD{
											@Override public String enumMethod() 
												{
													return "OverRided";
												};
												};

												public String enumMethod() {
													return "Local";
												}
	}
	
	public void charTest(){
		Character ch =  new Character('a');
		System.out.println(ch.toString().toUpperCase());
	}
	
	public void stringTest(){
		String sr = "abc is good, ";
		sr =  sr + "def is bad";
		sr = j;
		j = "again";
		System.out.println(sr);
	}
	
	public void calenderTest(){
		Calendar c = Calendar.getInstance();
		GregorianCalendar  gc = new  GregorianCalendar();
		System.out.println(c);
	}
	
	public int varArgMethod (int... num){
		int result = num [0];
		for (int i=0; i < num.length; i++){
			if (num [i] == 3)
				result = 3;
		}
		System.out.println(result);
		return result;
	}
	
	public void filing () throws IOException, Exception{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try{
//			File file = new File("C://Input.txt");
//			System.out.println(file.getCanonicalPath());
			in = new FileInputStream("C://Input.txt");
			out = new FileOutputStream("D://Output.txt");
			int count;
			while( (count = in.read()) != -1){
				out.write(count);
			}
		}
		catch (IOException e){
			System.out.println(e.getMessage());
			throw new IOException();
		}
		finally{
			if (in != null)
				in.close();
			if(out != null)
				out.close();
		}
	}
	
	public static void main (String[]a){
//		https://www.tutorialspoint.com/java/java_serialization.htm
//		System.out.println("Run now ...");
//		System.out.println("Enum : " + TestingEnum.Test1);
//		System.out.println("Enum : " + Test.TestingEnum.Test2);
//		System.out.println("Enum : " + TestingEnum.METHOD);
//		System.out.println("Enum : " + TestingEnum.METHOD.enumMethod());
//		
//		Helper help = new Helper();
//		help.HelpingStuff();
		Helper.returnArray(1,2,3,4,5);
		Helper.returnArray('A', 'B', 'C', 'D', 'E');
		Helper.returnArray("ABC", "DEF", "XYZ");
//		System.out.println(Helper.constTest + " OR " + help.constTest);
//		Lion l = new Lion();
//		System.out.println(l.procTest);
//		System.out.println(l.accessTest);
//		Test.main(a);
//		Test t = new Test();
//		int res = t.varArgMethod(1,2,3);
//		try {
//			t.filing();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t.charTest();
//		t.stringTest();
//		t.calenderTest();
//		Lion l = new Lion();
//		String [] str = {"abc", "123","false","true"};
//		l.main(str);
//		main(str);
		
		List<String> l = new ArrayList<String>();
		l.add("");
		l.add(null);
		l.add("a");
		l.add("a");
		l.add("b");
		
		Set<String> s = new HashSet<String>();
		s.addAll(l);
		System.out.print(s);
	}
}
