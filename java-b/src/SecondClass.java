

import java.util.Scanner;

public class SecondClass {
	
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName;
		
		pr("Enter Your Name: ");
		myName = myScanner.nextLine();
		
		prln(myName.length());
		
		// array declaration
		
		// 1 2 4 5
		// 2 4 5 9
		
		int[][] twoDArray = new int[2][4];
		
		twoDArray[0][0]=1;
		twoDArray[0][1]=2;
		twoDArray[0][2]=4;
		twoDArray[0][3]=5;
		
		twoDArray[1][0]=2;
		twoDArray[1][1]=4;
		twoDArray[1][2]=5;
		twoDArray[1][3]=9;
		
		prln(twoDArray[1][2] += (twoDArray[0][2]*twoDArray[1][1]));
		
//		if(myName.length()>15) {
//			prln("this is verly good");
//		}
//		else{
//			prln("this is not verly good");
//		}
		
		switch (myName.length()) {
		case 4:
			prln("this is 4");
			break;
		case 6:
			prln("this is 6");
			break;
		case 8:
			prln("this is 8");
			break;

		default:
			prln("nothing to ");
		}
	}
	
	static void prln(Object myobject) {
		System.out.println(myobject);
	}
	static void pr(Object myobject) {
		System.out.print(myobject);
	}

}
