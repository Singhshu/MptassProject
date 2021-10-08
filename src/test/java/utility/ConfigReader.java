package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties getPropertyObject() throws IOException {
		FileInputStream fp = new FileInputStream(
				"C:\\Users\\shubh\\eclipse-workspace\\MptassProject\\src\\test\\java\\utility\\data.properties");

		Properties prop = new Properties();
		prop.load(fp);
		return prop;
	}

	public static String getUrl() throws IOException {
		return getPropertyObject().getProperty("url");
	}

	public static String getUsername() throws IOException {
		return getPropertyObject().getProperty("Username");
	}

	public static String getPassword() throws IOException {
		return getPropertyObject().getProperty("Password");
	}

	public static String getProfileId1() throws IOException {
		return getPropertyObject().getProperty("ProfileId1");
	}

	public static String getProfileId2() throws IOException {
		return getPropertyObject().getProperty("ProfileId2");
	}
}