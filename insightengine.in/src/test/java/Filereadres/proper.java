package Filereadres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class proper {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\insightengine.in\\src\\test\\java\\Filereadres\\DataFile");
		Properties p = new Properties();
		p.load(fr);
		
	}

}
