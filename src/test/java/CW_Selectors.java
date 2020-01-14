import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CW_Selectors extends TestBase {


    @Test
    public void WikiElementsTest(){
        openSite("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector("#js-link-box-ru")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='js-link-box-ru']")).click();
    }

}
