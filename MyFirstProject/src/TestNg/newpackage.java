package TestNg;

import org.testng.annotations.Test;

public class newpackage {

	@Test (groups = {"sanity","login"})
	public void test() {
		System.out.println("this is from both groups");
	}

}
