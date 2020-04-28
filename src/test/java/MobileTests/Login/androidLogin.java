package MobileTests.Login;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import Academy.TestProperties;
import Academy.UIOperation;
import resources.MobileTestBase;

public class androidLogin extends MobileTestBase implements login{
	public static Properties prop;
	UIOperation operation = new Academy.UIOperation(driver);
	public void login() throws Exception {
		prop =   TestProperties.getProperty();
		driver.findElement(By.xpath("")).click();
	}

}
