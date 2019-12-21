import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWiki extends TestBase{


    @Test
    public void login()  {
        openSite("https://www.wikipedia.org/");

        selectLanguage();

        initLogin();

        fillLoginForm();
        driver.findElement(By.id("wpLoginAttempt")).click();

    }

    public void fillLoginForm() {
        type(By.id("wpName1"), "KonkoVladik");

        type(By.id("wpPassword1"), "wiki7777");
    }

    public void selectLanguage() {
        driver.findElement(By.id("js-link-box-en")).click();
    }

    public void initLogin() {
        driver.findElement(By.id("pt-login")).click();
    }

    public void type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }


}
