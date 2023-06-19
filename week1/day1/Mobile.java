package week1.day1;

public class Mobile {
public void sendsms() {
	System.out.println("Hello Testleaf");

}
protected void allowVoicecall() {
System.out.println("This is protected");	

}
private void takevideo() {
	System.out.println("This is private");

}
public static void main(String[] arg) {

	Mobile obj= new Mobile();
obj.allowVoicecall();
obj.sendsms();
obj.takevideo();

 }
}
	
	
	
	

   







