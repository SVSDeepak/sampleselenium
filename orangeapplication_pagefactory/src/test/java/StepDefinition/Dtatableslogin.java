package StepDefinition;

import io.cucumber.java.en.When;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pages.page1;
import io.cucumber.datatable.DataTable;

public class Dtatableslogin {
	
	@When("User Enters Login Credentials")
	public void user_enters_login_credentials(DataTable dataTable) throws Exception {
		
		List<List<String>> credentials = credentials(
				"C:\\Users\\svs deepak\\eclipse-workspace\\orangeapplication_pagefactory\\src\\test\\resources\\Testdata.xlsx");
		dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		page1.enterusername(dataTable.cell(0, 0));
		page1.enterpassword(dataTable.cell(0, 1));
		
	}
	
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}

}
