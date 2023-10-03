import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testCalculator {
	SoftAssert softassert = new SoftAssert();
	Calculator cal = new Calculator();

	@DataProvider(name = "data1")
	public Object[][] dpMethod() {
		return new Object[][] { { 10.0, 2.0, 5.0, "positive ,positive" }, { 10.0, -2.0, -5.0, "positive ,negative" },
				{ -10.0, 2.0, -5.0, "negative ,positive " }, { -10.0, -2.0, 5.0, "negative ,negative " },
				{ 0, 2.0, 0, "zero ,positive " }, { 0, -2.0, 0, "zero ,negative " }, };
	}

	@DataProvider(name = "data2")
	public Object[][] dpMethod1() {
		return new Object[][] { { 10, 0 } };

	}
	
	@Test(priority = 2)
	public void test111() {
		Assert.assertTrue(true);
	}

	@Test(priority = 1)
	public void test222() {
		Assert.assertTrue(true);
	}

	@Test(dataProvider = "data1")
	public void testvalid(double x, double y, double expected, String caseOFNums) {
		double result = cal.division(x, y);
		softassert.assertEquals(result, expected);
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + " caseofNums is : " + caseOFNums + "\n");
	}

	@Test(dataProvider = "data2", expectedExceptions = ArithmeticException.class, priority = 1)
	public void testinvalid(double x, double y) {
		cal.division(x, y);
	}
//	
//	

}

//@BeforeTest
//public void beforeStart() {
////	driver = new ChromeDriver();
////	driver.manage().window().maximize();
////	driver.get("https://samirmansour.ps/");
//}
//
//@Test 
//public void testDivision1 () {
//	Calculator cal = new Calculator();
//	double divide = cal.division(20,5) ;
//	System.out.println(divide);
//	Assert.assertEquals(divide, 4);
//}
