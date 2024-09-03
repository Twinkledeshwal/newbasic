package failure;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	@Test

	 public void testCase1() {               //fail

	  System.out.println("this is testcase1");

	  Assert.assertTrue(false);

	 }
	 @Test

	 public void testCase2() {                 //pass
	  System.out.println("this is testcase2");

	  Assert.assertTrue(true);
	 }

}
