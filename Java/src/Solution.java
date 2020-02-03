import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int solution(String S) {
		// write your code in Java SE 8
		int count = S.length();
		int combination = 0;
		combination += count;

		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < i; j++) {
				boolean res = equal(S.charAt(i), S.charAt(j));
				if (res)
					combination += 1;
			}
		}

		// for (int i = 0; i < S.length() - 1; i++) {
		// char a = S.charAt(i);
		//
		// int j = S.charAt(i + 1);
		// for (j = 0; j < S.length(); j++) {
		// if (a == S.charAt(j)) {
		// combination += 1;
		// break;
		// }
		// }
		// }

		System.out.println(combination);
		return 0;
	}

	private boolean equal(char i, char j) {
		if (i == j)
			return true;
		else
			return false;
	}

	private boolean compareThem(int i, int j, int k) {
		if (i == j)
			return true;
		else if (j == k)
			return true;
		else if (i == k)
			return true;

		else
			return false;
	}

	static String convert(long input) {
		boolean flag = true;
		int res = 0;
		while (input % 7 == 0) {
			input = (input / 7);

		}
		return "";
	}

	public int index(int[] A) {
		int resultIndex = -1;
		int res = 0;
		int selectedIndexValue = 0;
		int selectedIndex = 0;
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				res += A[i];
			}
			for (int k = i + 1; k < A.length; k++) {
				selectedIndex += A[k];
			}
			if (res == selectedIndex) {
				selectedIndexValue = i;
			}
		}

		return selectedIndexValue;
	}

	public static void main(String... args) throws ParseException {
		Solution s1 = new Solution();
//		int[] A = new int[8];
//		A[0] = -1;
//		A[1] = 3;
//		A[2] = -4;
//		A[3] = 5;
//		A[4] = 1;
//		A[5] = -6;
//		A[6] = 2;
//		A[7] = 1;
		// s.solution("02002");
		// System.out.print(s.index(A));

		// Scanner scan = new Scanner(System.in);
		// int i = scan.nextInt();
		// Double d = scan.nextDouble();
		// String s = scan.next();
		// s = s + scan.nextLine();
		//
		// System.out.println("String: " + s);
		// System.out.println("Double: " + d);
		// System.out.println("Int: " + i);
		//
		// System.out.printf("%-15s %s\n", s, d);

//		Scanner in = new Scanner(System.in);
//		int t = in.nextInt();
//		for (int i = 0; i < t; i++) {
//			int a = in.nextInt();
//			int b = in.nextInt();
//			int n = in.nextInt();
//			for (int j = 0; j < n; j++) {
//				int res = 0;
//				int x = 1;
//				for (int k = 0; k <= j; k++) {
//					res += b * x;
//					x += x;
//				}
//				res += a;
//				System.out.print(res + " ");
//			}
//		}
//		in.close();
		
//        try
//        {
//            long x=sc.nextLong();
//            System.out.println(x+" can be fitted in:");
//            if(x>=-128 && x<=127)System.out.println("* byte");
//            //Complete the code
//            if(x>= Short.MIN_VALUE && x<= Short.MAX_VALUE)System.out.println("* short \n* int\n* long");
//            if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int\n* long");
//            if(x>= Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
//        }
//        catch(Exception e)
//        {
//            System.out.println(sc.next()+" can't be fitted anywhere.");
//        }
//        Scanner in = new Scanner(System.in);
//        String month = in.next();
//        String day = in.next();
//        String year = in.next();
//        int mnt = Integer.parseInt(month);
//        int dy = Integer.parseInt(day);
//        int yr = Integer.parseInt(year);
//        String date = yr + "/" + mnt + "/" + dy;
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
//        java.util.Date dte = formatter.parse(date);
//        
//        Calendar c = Calendar.getInstance();
//        int day_of_week = c.get(Calendar.DAY_OF_WEEK);	
////        System.out.print(res);
//        System.out.print(new SimpleDateFormat("EEEE").format(day_of_week));
        
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();    
	}
	
}