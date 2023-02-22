package exercise01Folder;
 
import java.util.ArrayList;

public class Browser {
	private ArrayList url= new ArrayList<String>();
    public String browserName;
	Browser(){}
	Browser(String urlinit){
		
		url.add(urlinit);
		}
	public void set( String s) {
		
	      url.add(s);
	}

	public void print() {
		System.out.println("the urls are " +url);
}
}