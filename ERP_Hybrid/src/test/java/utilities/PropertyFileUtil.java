package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
public static String getValueForKey(String key) throws Throwable
{
	Properties conpro = new Properties();
	//load file
	conpro.load(new FileInputStream("./PropertyFiles/Environment.properties"));
	return conpro.getProperty(key);
	
}
}