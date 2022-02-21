package com.projectname.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() throws IOException {

		String cfpath = System.getProperty("user.dir") + "\\Configer\\Config.Properties";

		File src = new File(cfpath);
		try {
			FileInputStream file = new FileInputStream(src);

			pro = new Properties();
			pro.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

		public String getBrowser() {
			return pro.getProperty("BrowserName");
	}
        public String getURL() {
        	return pro.getProperty("BaseURL");
        }
}
