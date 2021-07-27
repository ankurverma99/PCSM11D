package demoTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	@BeforeSuite
	public void bs() {
		System.out.println("Before s");
	}

	@BeforeTest
	public void bt() {
		System.out.println("before t");
	}

	@BeforeClass
	public void bc() {
		System.out.println("Before C");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("Before M");
	}

	@Test
	public void tc1() {
		System.out.println("hello..! 1");
	}

	@Test
	public void tc2() {
		System.out.println("hello..! 2");
	}

	@AfterMethod
	public void am() {
		System.out.println("After m");
	}

	@AfterClass
	public void ac() {
		System.out.println("After c");
	}

	@AfterTest
	public void at() {
		System.out.println("after t");
	}

	@AfterSuite
	public void as() {
		System.out.println("after s");
	}

}
