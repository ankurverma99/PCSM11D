package demoTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {

	@Test(groups = "smoke", dependsOnMethods = "tc4")
	public void login() {
		System.out.println("hiii..!1 ");
		Assert.fail();
	}

	@Test(groups = "inte", dependsOnGroups = "fun")
	public void chat() {
		System.out.println("hiii..!2 ");
	}

	@Test(groups = "fun", dependsOnGroups = "smoke")
	public void tc3() {
		System.out.println("hiii..!3 ");
	}

	@Test(groups = "smoke")
	public void tc4() {
		System.out.println("hiii..!4");
	}

	@Test(groups = "inte", dependsOnGroups = "fun")
	public void tc5() {
		System.out.println("hiii..!5 ");
	}

	@Test(groups = "fun", dependsOnGroups = "smoke")
	public void tc6() {
		System.out.println("hiii..!6 ");
	}

	@Test(groups = "smoke", priority = -1, invocationCount = 2)
	public void tc7() {
		System.out.println("hiii..!7 ");
	}

}
