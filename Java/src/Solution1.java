import java.text.NumberFormat;
import java.util.*;



public class Solution1 {
//		public static boolean flag = false;
//		static int B;
//		static int H;
//		
//	static {
//		Scanner scan =  new Scanner (System.in);
//		B = scan.nextInt();
//		H = scan.nextInt();
//		if (B > 0 && H > 0){
//			flag = true;
//		}
//		else 
//			System.out.print("java.lang.Exception: Breadth and height must be positive");
//	}
//	
//	
	public static void main (String []args){
//		if (flag){
//			int area = B*H;
//			System.out.print(area);
//		}
//	    Scanner in = new Scanner(System.in);
//	    String s = in.next();
//	    int count = 0;
//	    for (int i=0; i < s.length() ; i++){
//	    	char check = s.charAt(i);
//	    	if (Character.isUpperCase(check))
//	    		count++;
//	    }
//	    System.out.print(count);
		
//	      Scanner scanner = new Scanner(System.in);
//	        double payment = scanner.nextDouble();
//	        scanner.close();
//	        
//	        String us = "";
//	        String india = "";
//	        String china = "";
//	        String france = "";
//	        Locale inLocale = new Locale("en", "IN");
//	        NumberFormat usFormt = NumberFormat.getCurrencyInstance(Locale.US);
//	        NumberFormat inFormt = NumberFormat.getCurrencyInstance(inLocale);
//	        NumberFormat chFormt = NumberFormat.getCurrencyInstance(Locale.CHINA);
//	        NumberFormat frFormt = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//	        
//	        
//	        us = usFormt.format(payment);
//	        india = inFormt.format(payment);
//	        china = chFormt.format(payment);
//	        france = frFormt.format(payment);
//	        System.out.println("US: " + us);
//	        System.out.println("India: " + india);
//	        System.out.println("China: " + china);
//	        System.out.println("France: " + france);
		
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        int countA =  A.length() ;
//        int countB = B.length();
//        int count = countA + countB;
//        int chk = A.compareTo(B);
//        String output;
//		if (chk < 0)
//        	output = "No";
//		else
//			output = "Yes";
//		String A1 = A.replace(A.charAt(0), A.toUpperCase().charAt(0));
//		String B1 = B.replace(B.charAt(0), B.toUpperCase().charAt(0));
//		
//		System.out.println(count);
//		System.out.println(output);
//		System.out.println(A1+ " "+ B1);
		
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else{
	         // Complete the code 
	          if ((n%2==0) &&(n >=2 && n <=5))
	              ans = "Not Weired";
	          else if ((n%2==0) &&(n >=6 && n <20))
	              ans = "Weird";
	          else if ( n > 20)
	              ans = "Not Weired";
	      }
	      System.out.println(ans);
	   }
        	
}
