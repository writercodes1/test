import java.util.Scanner;
class Pwd{
public static void main(String []args){
Scanner ss=new Scanner(System.in);
System.out.println("Enter your name");
String name=ss.next();

System.out.println("Enter your address");
String add=ss.next();

System.out.println("Enter your phone no");
String phone=ss.next();

System.out.println("Enter your email");
String email=ss.next();

String password="@"+name.substring(0,2)+add.substring(0,2)+email.substring(0,2);
System.out.println("your passwords is- "+password);

}
}