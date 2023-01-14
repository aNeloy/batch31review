package saturdayClass;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PremierLeague {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\baker\\Documents\\Book1.xlsx"));
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.premierleague.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@style='background-color:#37003c;'])[1]")).click();
		List<WebElement> teams = driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]"));
 		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.createSheet("Team Names");
		for(int i = 0; i <teams.size(); i++) {
			System.out.println(teams.get(i).getText().trim());
		}
		wb.close();

	}

}
