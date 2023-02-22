package exercise01Folder;

import java.util.Scanner;

public class BrowserCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		int number;
		Browser b =new Browser();
		Browser chrome= new Browser();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number" );
		number = sc.nextInt();
		
        for(int i=1;i<=number;i++) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the url:");
        
        s =scan.nextLine();
        b= new Browser(s);
        //b.set(s);
        }
        
        
b.print();
chrome.print();
//System.out.println( s[1]);
	}


	

}
