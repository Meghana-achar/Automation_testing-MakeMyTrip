package makemytrip;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

	
		        // Set up the WebDriver (Assuming you are using Chrome)
		        System.setProperty("webdriver.chrome.driver", "C:\\selenium_webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe"); // Update with the path to your ChromeDriver
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.makemytrip.com/");
	            driver.manage().window().maximize();
	            try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            WebElement closePopup = driver.findElement(By.id("SW"));
	               
	                closePopup.click();
	             // Click on the "From" input field and enter the departure city
	                WebElement hotel= driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/span/a/span[1]/span"));
	                hotel.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                
	                WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]"));
	                searchbar.click();
	                WebElement city=driver.findElement(By.id("hsw_inputBox_city"));
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	               city.click();
	                WebElement write=driver.findElement(By.xpath("//*[@id=\"hsw_inputBox_city\"]/div[1]/form/div/div[1]/input"));
	                write.sendKeys("Delhi");
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                
	                WebElement select=driver.findElement(By.className("hw__nearbyTextWrapper"));
	                select.click();
	                WebElement checkin=driver.findElement(By.xpath("//*[@id=\"hsw_inputBox_check_in\"]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]"));
	                checkin.click();
	                
	                WebElement checkout=driver.findElement(By.xpath("//*[@id=\"hsw_inputBox_check_in\"]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]"));
	                checkout.click();
	                WebElement adult=driver.findElement(By.xpath("//*[@id=\"hsw_inputBox_room_guests\"]/div[1]/div[1]/div[2]/div[2]/div"));
	                adult.click();
	                WebElement oneadult=driver.findElement(By.xpath("//*[@id=\"hsw_inputBox_room_guests\"]/div[1]/div[1]/div[2]/div[2]/ul/li[1]"));
	                oneadult.click();
	                WebElement apply=driver.findElement(By.xpath("//*[@id=\"hsw_inputBox_room_guests\"]/div[1]/div[2]/button "));
	                try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	                apply.click();
	                //WebElement room=driver.findElement(By.id("Listing_hotel_0"));
	               // room.click();
	                
	                //JavascriptExecutor js = (JavascriptExecutor) driver;

	                // Scroll down by pixels (vertical scroll)
	                //js.executeScript("window.scrollBy(0, 1000)");
	                try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	                WebElement flight=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/nav/ul/li[1]/span/a"));
	                flight.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	                
	                WebElement studentoff=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div[2]"));
	                studentoff.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	                WebElement retur=driver.findElement(By.id("top-banner"));
	                retur.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	                
	                WebElement to=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div/div/ul/li[1]/div/div/div/div[1]/div/p"));
	                to.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

	                WebElement dept=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]/div"));
	                dept.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}                
	                WebElement srch=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/p/a"));
	                srch.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}  
	                WebElement holipack=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/nav/ul/li[4]/span/a"));
	                holipack.click();
	                try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}       
	                WebElement airline=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/ul/li[3]/span[2]"));
	                airline.click();
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}   
	                WebElement kashmir=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/ul[1]/li[2]/a"));
	                kashmir.click();



	}

}
