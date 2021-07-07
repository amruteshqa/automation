package handlingProprtyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty("browser");//key value("")
		System.out.println(data);

	}

}
