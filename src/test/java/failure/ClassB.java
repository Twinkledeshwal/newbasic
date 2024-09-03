package failure;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {
	@Test

	 public void testCase3() {                   //fail

	  System.out.println("this is testcase3");

	  Assert.assertTrue(false);

	 }
	 @Test

	 public void testCase4() {                          //pass
	  System.out.println("this is testcase4");

	  Assert.assertTrue(true);
	 }

}
