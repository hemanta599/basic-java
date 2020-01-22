package second;

import java.util.Scanner;


public class third {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] myArray = new int [100];
		
//		int i = 100;
		
//		while (i>0) {
//			myArray[i-1]= i;
//			i--;
//		}
//		prln("array["+99+"]"+myArray[99]);
//		
//		
//		while (i<100) {
//			prln(myArray[i]);
//			i++;
//		}
		
//		
//		for(int i = 100; i>0; i--) {
//			myArray[i-1] = i-1;
//		}
//		prln("array["+50+"]:"+myArray[50]);
//		
//		for(int j = 0; j<100; j++) {
//			prln("array["+j+"]:"+myArray[j]);
//		}
//		
//		int p = 2;
//		do {
//			prln("allist one step display");
//			p--;
//		} while (p>2);
		
		
		
		//twoD array 
		
//		[0][1]=1
//		[0][2]=4
//		[0][3]=5
//		[0][4]=6
//		
//		[1][1]=7
//		[1][2]=8
//		[1][3]=9
//		[1][4]=5
		
		int [][] store = new int[2][4];
		
		
		try {
			store[0][1]=1;
			store[0][2]=4;
			store[0][3]=5;
			store[0][4]=6;
			store[1][1]=7;
			store[1][2]=8;
			store[1][3]=9;
			store[1][4]=5;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		prln("set the Array value");
//		for(int row=0; row<2; row++) {
//			
//			
//			for(int column=0; column<4; column++) {
//				
//				pr("store["+row+"]"+"["+column+"]");
//				store[row][column]=myScanner.nextInt();
//			}
//		}
		
		try {
			for(int row=0; row<2; row++) {
				for(int column=0; column<4; column++) {
					pr(store[row][column]+"\t");
				}
				prln("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		prln("thank you your profession");
		
	}
	
	static void prln(Object myobject) {
		System.out.println(myobject);
	}
	static void pr(Object myobject) {
		System.out.print(myobject);
	}

}
