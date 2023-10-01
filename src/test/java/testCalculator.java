
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testCalculator {
	SoftAssert softassert = new SoftAssert();
	Calculator cal = new Calculator();

	@DataProvider(name = "data1")
	public Object[][] dpMethod() {
		return new Object[][] { 
			{ 10.0, 2.0, 5.0, "positive ,positive" }, 
			{ 10.0, -2.0, -5.0, "positive ,negative" },
			{ -10.0, 2.0, -5.0, "negative ,positive " }, 
			{ -10.0, -2.0, 5.0, "negative ,negative " },
			{ 0, 2.0, 0, "zero ,positive " }, 
			{ 0, -2.0, 0, "zero ,negative " }, 
				};

	}

	@Test(dataProvider = "data1")
	public void test1(double x, double y, double expected, String caseForNum) {
		double result = cal.division(x, y);
		softassert.assertEquals(result, expected);
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + " caseForNum is : " + caseForNum);
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
