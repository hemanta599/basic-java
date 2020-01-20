package second;

import java.util.Scanner;


public class Storbook {
	
	static Scanner myScanner = new Scanner(System.in);
	
	static String[] books= {"java","c","php"};
	
	static final double studentDiscount = 0.3;
	static final double teacherDiscount = 0.4;
	static final double alienDiscount = 0.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prln("---------WELLCOME TO OUR BOOKSTOR-----------");
		prln("which book you want?\nAns:");
		String userchoose = myScanner.nextLine();
		
		if(books[0].toLowerCase().equals(userchoose.toLowerCase())) {
			prln("you opted "+ books[0]);
			calculatePrice();
		}else if(books[1].toLowerCase().equals(userchoose.toLowerCase())) {
			prln("you opted "+ books[1]);
			calculatePrice();
		}else if(books[2].toLowerCase().equals(userchoose.toLowerCase())) {
			prln("you opted "+ books[2]);
			calculatePrice();
		}else {
			prln("not available that book");
		}
			
	}
	
	static void calculatePrice(){
		pr("Are you a Student,Teacher or alien?\nAns:");
		String answer=myScanner.nextLine();
		
		double price=200;
		
		if (answer.toLowerCase().equals("teacher")) {
			price=price-(price*teacherDiscount);
			showprice(price);
		}else if (answer.toLowerCase().equals("student")) {
			price=price-(price*studentDiscount);
			showprice(price);
		}else if (answer.toLowerCase().equals("alien")) {
			price=price-(price*alienDiscount);
			showprice(price);
		}else {
			prln("Sorry, We can't serve you!!");
		}
		
		
	}
	
	static void showprice(double pricee) {
		prln("Your total payable amount: "+pricee);
		prln("\n------------THANK YOU FOR SHOPPING FROM OUR BOOKSTORE--------------");
	}
	
	
	
	static void prln(Object myobject) {
		System.out.println(myobject);
	}
	static void pr(Object myobject) {
		System.out.print(myobject);
	}

}
