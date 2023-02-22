package exercise01Folder;

import java.util.Scanner;
import java.util.ArrayList;

public class TheMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option,noOfBrowser=0,noOfUrls;
		String s,name,me;
		//Browser[] browserArray;
		ArrayList<Browser> browserArray=new ArrayList();
		//browserArray= new Browser[1];
        System.out.println("The Menu:");
        System.out.println("1.Add a browser\n2.Delete a browser\n3.Display the bowsers");
        System.out.println("4.Dislay Browser contents\n Enter the option");
        
        Scanner scanOption= new Scanner(System.in);
        option= scanOption.nextInt();
        while(option!=5) {
        	
        if(option==1) {
        	//noOfBrowser++;
        	Browser n=new Browser();
        	Scanner sc = new Scanner(System.in);
    		System.out.println("enter the number" );
    		noOfUrls = sc.nextInt();
    		
            for(int i=1;i<=noOfUrls;i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the url:");
            
            s =scan.nextLine();
            n.set(s);
            }
            browserArray.add(n);
            Scanner c = new Scanner(System.in);
    		//System.out.println("enter the name for browser" );
    		//name = sc.next();
        	
        }
        else if(option==2) {
        	browserArray.remove(browserArray.size()-1);
        	//noOfBrowser--;
        }
        else if(option==3) {
        	
        		System.out.println(browserArray);
        	
        	
        }
        else {
        	Browser b=new Browser();
        	for(int i=0;i<browserArray.size();i++) {
        	 b=browserArray.get(i);
        	 b.print();
        	}
        }
        System.out.println("The Menu:");
        System.out.println("1.Add a browser\n2.Delete a browser\n3.Display the bowsers");
        System.out.println("4.Dislay Browser contents\n Enter the option");
        System.out.println("Enter the option: ");
        option= scanOption.nextInt();
        }
	}
	

}
