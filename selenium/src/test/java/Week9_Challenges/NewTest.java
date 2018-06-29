package Week9_Challenges;

import org.testng.annotations.Test;
import org.apache.commons.mail.EmailException;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  int a=50;
	  int b=50;
	  
	  if (a==b) {
		  
		  System.out.println("Test method");
	  }
  }
  @AfterMethod
  public void afterMethod() throws EmailException {
	  

	  SendEmail.send_Email();
	  
  }

}
