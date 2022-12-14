package encapsulation;
class Icici
{
private String password="ici@1234";	

public String getpassword()
{
 return password;	
}
public void setpassword(String password)
{
this.password=password;	
}
}
public class Mainclass {
public static void main(String[] args) {
	Icici i1=new Icici();
	System.out.println(i1.getpassword());
	i1.setpassword("icici@132");
	System.out.println(i1.getpassword());
}
}
