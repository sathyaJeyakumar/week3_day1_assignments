package week3_day1_assignments;

public class LoginTestDataInheritance extends TestDataInheritance{

	public static void main(String[] args) {
		LoginTestDataInheritance pcoLoginTestDataInheritance = new LoginTestDataInheritance();
		//calling methods in subclass
		pcoLoginTestDataInheritance.EnterUsername();
		pcoLoginTestDataInheritance.EnterPassword();
		
		//calling methods in super class/parent class
		pcoLoginTestDataInheritance.EnterCredentials();
		pcoLoginTestDataInheritance.NavigateToHomePage();
		
	}
	
	public void EnterUsername() {
		
		System.out.println("LoginTestData page: enterUsername()");
	}
	 
	public void EnterPassword() {
		System.out.println("LoginTestData page: enterPassword()");
	}

}
