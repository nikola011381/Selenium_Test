import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class QA_Git
{
    public static void main(String[] args) throws Throwable
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        driver.findElement(By.id("user[login]")).sendKeys("test");
        driver.findElement(By.id("user[email]")).sendKeys("test@test.com");
        driver.findElement(By.id("user[password]")).sendKeys("test");
        driver.findElement(By.xpath("//*[contains(text(), 'Sign up for GitHub')]")).click();


    }
}
