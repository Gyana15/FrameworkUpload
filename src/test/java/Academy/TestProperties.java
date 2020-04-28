package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	

	public static Properties prop = new Properties();

	
	public static Properties getProperty() throws IOException {

		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\objectRepository\\AndroidObjects.properties");
		prop.load(fis);
		
		System.out.println(Integer.parseInt(prop.getProperty("explicit.wait")));
		return prop;

		
		
	}

}
