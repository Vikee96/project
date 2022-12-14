package encapsulation;
class Gmail{
	private String pwd="dinga";
			
 public String	getpwd()
 {
	 return pwd;
 }
 public void setpwd(String pwd)
 {
	 this.pwd=pwd;
 }
}
public class User1 {
	public static void main(String[] args) {
		Gmail u1=new Gmail();
		System.out.println(u1.getpwd());
		u1.setpwd("dingdong");
		System.out.println(u1.getpwd());
	}
}
