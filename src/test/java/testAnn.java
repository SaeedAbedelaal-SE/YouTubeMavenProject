import org.testng.Assert;
import org.testng.annotations.Test;

public class testAnn {
	@Test(priority = 2)
	public void test111() {
		Assert.assertTrue(true);
	}

	@Test(priority = 1)
	public void test222() {
		Assert.assertTrue(true);
	}

	@Test()
	public void test333() {
		Assert.assertTrue(true);
	}

	@Test()
	public void testt444() {
		Assert.assertTrue(true);
	}

	@Test()
	public void testt555() {
		Assert.assertTrue(true);
	}
}
