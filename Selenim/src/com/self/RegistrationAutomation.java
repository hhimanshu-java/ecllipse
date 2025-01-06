package com.self;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class RegistrationAutomation {
    public static void main(String[] args) {
        // Initialize resources
        try (FileInputStream fis = new FileInputStream("./Test Data/A35properties.xlsx");
             FileInputStream file = new FileInputStream("./Test Data/url.properties")) {

            // Load Excel Workbook and Properties
            Workbook workbook = WorkbookFactory.create(fis);
            Properties prop = new Properties();
            prop.load(file);

            // Retrieve URL and form data
            String url = prop.getProperty("url");
            String FN = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
            String LN = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
            String mail = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
            String password = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
            String cnfrmpswrd = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();

            System.out.println(FN + " " + LN + " " + mail + " " + password + " " + cnfrmpswrd);

            // Set up WebDriver
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get(url);

            // Fill and submit registration form
            driver.findElement(By.id("gender-male")).click();
            driver.findElement(By.id("FirstName")).sendKeys(FN);
            driver.findElement(By.id("LastName")).sendKeys(LN);
            driver.findElement(By.id("Email")).sendKeys(mail);
            driver.findElement(By.id("Password")).sendKeys(password);
            driver.findElement(By.id("ConfirmPassword")).sendKeys(cnfrmpswrd);
            driver.findElement(By.id("register-button")).click();

            // Capture result screenshot
            WebElement result = driver.findElement(By.xpath("//div[@class='result']"));
            saveScreenshot(result, "./Screenshot/Result.png");

            // Wait for result page and check URL
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            boolean registerPage = wait.until(ExpectedConditions.urlContains("registerresult/1"));
            System.out.println("IS USER ABLE TO REGISTER :- " + registerPage);

            // Click continue and capture account email screenshot
            driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
            WebElement mailElement = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
            saveScreenshot(mailElement, "./Screenshot/mailid.png");

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveScreenshot(WebElement element, String filePath) {
        try {
            File temp = element.getScreenshotAs(OutputType.FILE);
            File dest = new File(filePath);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            FileHandler.copy(temp, dest);
        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
