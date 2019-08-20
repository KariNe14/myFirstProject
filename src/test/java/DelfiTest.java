import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DelfiTest {

    @Test
    public void checkDelfiPage(){
        System.setProperty("webdriver.chrome.driver", "C://Users/karivalt/Desktop/CogniLearn/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.delfi.lv");
        driver.findElement(By.xpath("//a[@href='https://rus.delfi.lv']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//body"))));
        String subscriptions = driver.findElement(By.xpath("//a[@class='nav-link border bg-dark text-white btn-pill ml-3 py-1 px-3 position-relative subscription-button']")).getText();

        Assertions.assertEquals("Подписка", subscriptions, "Text is different");
        driver.quit();
    //new line for commit
    }
}
