package com.baseClass_Adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver; // null
	public static String value; // null

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\eclipse-workspace\\mavenProject\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void onClick(WebElement element) {
		element.click();
	}

	public static void passValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void dropDown_select(WebElement element, String type, String value) {

		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);

			} else if (type.equalsIgnoreCase("byIndex")) {
				int index_value = Integer.parseInt(value); // converting string into integer so that we are using
															// parseInt method
				s.selectByIndex(index_value);
			} else if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			}

		} catch (Exception e) {
			e.printStackTrace(); //
		}
	}

	public static void dropDown_deselect(WebElement element, String value, String type) {
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byVisibleTexxt")) {
				s.deselectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byIndex")) {
				int index_value = Integer.parseInt(value);
				s.deselectByIndex(index_value);
			} else if (type.equalsIgnoreCase("byValue")) {
				s.deselectByValue(value);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollUpandDown(WebElement element) {

		JavascriptExecutor jse = (JavascriptExecutor) driver; // narrowing
		jse.executeScript("arguments[0].scrollIntoView();", element); // arguments[0] - parameter

	}

	public static void takeScreenShot(String fileName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(fileName);
		FileHandler.copy(src, des);

	}

	public static void mouseActions(String type, WebElement element) {
		Actions ac = new Actions(driver);
		if (type.equalsIgnoreCase("moveToElement")) { // move to element.
			ac.moveToElement(element).click().build().perform();
		} else if (type.equalsIgnoreCase("contextClick")) { // right click.
			ac.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("doubleClick")) { // double click.
			ac.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("click")) { // click.
			ac.click(element).build().perform();
		}
	}

	public static void dragAndDrop(WebElement src, WebElement des) {

		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, des).build().perform();
	}

	public static void keyboardActions(String type) throws AWTException {
		Robot r = new Robot();
		if (type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (type.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}
	}

	public static void promptAlert(String type, String value) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			a.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		} else if (type.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(value);
		}

	}

	public static void frame_method(String type, WebElement element, String value) {
		if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("nameOrId")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("frameElement")) {
			driver.switchTo().frame(element);
		}
	}

	public static void parentOrDefault_frame(String type) {
		if (type.equalsIgnoreCase("parentFrame")) {
			driver.switchTo().parentFrame();
		} else if (type.equalsIgnoreCase("defaultContent")) {
			driver.switchTo().defaultContent();
		}
	}

	public static void sleep(int value) throws InterruptedException {
		TimeUnit.SECONDS.sleep(value);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static String particularData(String path, int rowIndex, int columnIndex) throws Throwable {
		File f = new File(path);
		FileInputStream f_input = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(f_input);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(rowIndex);
		Cell cell = row.getCell(columnIndex);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();

		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int numeric_value = (int) numericCellValue;
			value = String.valueOf(numeric_value);
		}
		wb.close();
		return value;
	}

}