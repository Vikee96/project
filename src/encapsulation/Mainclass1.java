package encapsulation;
class Amazon{
	private String password="vik@539";
	public String getpassword()
	{
	return password;	
	}
	public void setpassword(String password){
		this.password=password;
	}
}
public class Mainclass1 {
public static void main(String[] args) {
	Amazon a1=new Amazon();
	System.out.println(a1.getpassword());
	a1.setpassword("vikee539@");
	System.out.println(a1.getpassword());
}
}
