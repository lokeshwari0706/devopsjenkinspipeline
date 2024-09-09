package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {
	
	@Test
	public void tc01() {
		Assert.assertTrue(false);
	}
	
	@Test
	private void tc02() {
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"tc01"})
	private void tc03() {
		Assert.assertTrue(true);
	}
	
}
