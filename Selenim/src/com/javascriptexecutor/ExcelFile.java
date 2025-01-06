package com.javascriptexecutor;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws Throwable{
		FileInputStream fis = new FileInputStream("./Test Data/123.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		double price = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		int p = (int) price;
		System.out.println(p);
		boolean bool = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(bool);
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
		
		int day = date.getDayOfMonth();
		String m = date.getMonth().toString().toLowerCase();
//		System.out.println(m);
		String month = m.replace('j', 'J');
			
		int year = date.getYear();
		System.out.println(day+"-"+month+"-"+year);
		
	}

}
