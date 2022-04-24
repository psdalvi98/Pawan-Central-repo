package Com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String path="C:\\Users\\lenovo\\Maven_Project_FrameWork\\Config\\ConfigProperties";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		 pro=new Properties();
		 pro.load(fis);
	}
	
	public String getStage_Url() {
		
		return pro.getProperty("Stage_Url");
	}
	public String getUsername() {
	return	pro.getProperty("UserName_Stage");
		
	}
	public String getpassword() {
		return pro.getProperty("Password_Stage");
	}
public String getLive_Url() {
		
		return pro.getProperty("Live_Url");
	
}
}

