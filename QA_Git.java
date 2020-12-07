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
        driver.findElement(By.id("user[login]")).sendKeys("s12313134");
        driver.findElement(By.id("user[email]")).sendKeys("s12313134grgr@s12313134.com");
        driver.findElement(By.id("user[password]")).sendKeys("s12313134");
        driver.findElement(By.xpath("//*[contains(text(), 'Sign up for GitHub')]")).click();


    }
}
