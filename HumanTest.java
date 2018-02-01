import java.util.Scanner;
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);
System.out.println("Please Enter Your First Name");

String FirstName = scanner.nextLine();

System.out.println("Please Enter Your Last Name");

String LastName = scanner.nextLine();

System.out.println ("Please Enter Your Middle Initial");

String MiddleInitial = scanner.nextLine();





GG Person1 = new GG (FirstName,LastName, MiddleInitial, "Doctor", 26);

System.out.println(Person1.Career +Person1.YearsOld);
	}
}
