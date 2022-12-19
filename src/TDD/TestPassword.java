package TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPassword {
  @Test
  public void CheckPassword() {
	  
		Assert.assertEquals(true, PasswordValidator.isValid("Abc134"));
  }
}
