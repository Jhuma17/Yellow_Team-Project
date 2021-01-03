package com.usa.utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zoopla.uk.baseclass.ZooplaSuperClass;

public class Utility extends ZooplaSuperClass {

	public static void waitForElement(WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(elem));// explicit wait

	}

	// Handle staleElement exception
	public static void elementClick(String locator, long tiomout) {
		new WebDriverWait(driver, tiomout).ignoring(StaleElementReferenceException.class).until((WebDriver driver) -> {
			driver.findElement(By.id(locator)).click();
			return true;
		});
	}

	// Handle input text/send text
	public static void getToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	@SuppressWarnings("resource")
	public static ArrayList<String> readExcellData(int columno) throws Throwable {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\jhuma\\eclipse-workspace\\YellowTeam_Automation\\TestData\\Zoopla test case.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("testData");
		Iterator<Row> rowiterator = sheet.iterator();
		rowiterator.next();

		ArrayList<String> list = new ArrayList<>();
		while (rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(columno).getStringCellValue());
		}

		System.out.println("List ::: " + list);
		return list;

	}
}
