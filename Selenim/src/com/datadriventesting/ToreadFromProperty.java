package com.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToreadFromProperty {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Test Data/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String mail = prop.getProperty("email");
		System.out.println(mail);
		String pass = prop.getProperty("password");
		System.out.println(pass);
		String url = prop.getProperty("url");
		System.out.println(url);
		String price = prop.getProperty("price");
		System.out.println(price);
	}

}
