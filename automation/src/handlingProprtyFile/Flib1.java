package handlingProprtyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib1 {
									//relative path
	public String readPropertyFile(String proppath, String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(proppath);
		Properties prop = new Properties();//object of properties
		
		prop.load(fis);//load method of prop
		String data = prop.getProperty(key);//getProperty method of prop
		
		return data;
		
	}

}
