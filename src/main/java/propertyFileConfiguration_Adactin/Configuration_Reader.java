package propertyFileConfiguration_Adactin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {

	 File f = new File("C:\\Users\\hp\\eclipse-workspace-2022\\AdactinProject\\src\\main\\java\\com_configure_Adactin\\configuration.properties");
	 FileInputStream f_input = new FileInputStream(f);
	 p = new Properties();
	 p.load(f_input);
	}
	
	public String getUrlData() {

		String url = p.getProperty("url");
		return url;
		
	}

	public String getUsernameData() {

		String username = p.getProperty("username");
		return username;
	}
	
	public String getPasswordData() {

		String password = p.getProperty("password");
		return password;
		
	}
}
