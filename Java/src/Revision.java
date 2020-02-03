import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.javafx.css.Rule;


public class Revision implements IClassInterface{

	public static void main (String... args){

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread ....");			
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println("TM :" + runtime.totalMemory());
		System.out.println("FM :" + runtime.freeMemory());
		
		List<String> str = new ArrayList<String>();
		str.add("abc");
		str.add("def");
		str.add("ghi");
		str.add(null);
		str.add("abc");
		System.out.println(str);		
		
		Set<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("def");
		hs.add("ghi");
		hs.add(null);
		hs.add("abc");
		System.out.println(hs);
		
		Map<Integer, String> hm = new HashMap <Integer,String>();
		hm.put(1,"abc");
		hm.put(2,"def");
		hm.put(3,"ghi");
		hm.put(null,null);
		hm.put(null,"abc");
		System.out.println(hm);
		 
	}
	
	@Override
	public void outFun() {}

}
