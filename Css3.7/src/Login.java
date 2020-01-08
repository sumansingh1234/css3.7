import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\name\\Documents\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/?utm_source=google&utm_medium=cpc&utm_campaign=spicejetbrandexact&gclid=EAIaIQobChMIydWpy4zt5gIVmR0rCh0PhAOPEAAYASAAEgITC_D_BwE");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[4]/a")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();
	System.out.println("sucess");
	System.out.println(driver.getTitle()); 
}
}
