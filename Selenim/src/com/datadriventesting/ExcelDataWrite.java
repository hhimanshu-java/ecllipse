package com.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataWrite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./Test Data/123.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			System.out.println("URL :- " + url);
			String mail = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
			System.out.println("EMAIL :- " + mail);
			String pass = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
			System.out.println("PASSWORD : - " + pass);
			WebDriver d = new ChromeDriver();
			d.get(url);
	}

}
