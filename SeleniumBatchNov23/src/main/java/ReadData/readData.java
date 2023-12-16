package ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readData {
	
	private static final String path = ".//src//main//resources//data.properties";
	
	Properties prop;
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	
	public readData() throws IOException {
		prop = new Properties();
		prop.load(fis);
	}
	
	public String getUsername() {
		return prop.getProperty("username");	
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	public String getfirstName() {
		return prop.getProperty("firstName");
	}
	public String getlastName() {
		return prop.getProperty("lastName");
	}
	public String getzipCode() {
		return prop.getProperty("zipCode");
	}
	public String getHeading() {
		return prop.getProperty("heading");
	}
	
}
