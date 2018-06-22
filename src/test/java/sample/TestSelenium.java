package sample;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {

    /**
     * Permet de set le path du driver avant les tests
     */
    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "/home/eleve/Documents/webapp-sample/geckodriver");
    }


    /**
     * Effectue un test de recherche google
     */
    @Test
    public void testGoogleSearch() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Adi3000");
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void testSeleniumSearch() throws Exception{
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumhq.org/");
        Thread.sleep(5000);
        WebElement searchBox = driver.findElement(By.linkText("Projects"));
        searchBox.click();
        Thread.sleep(5000);
        WebElement searchLink = driver.findElement(By.linkText("Selenium WebDriver"));
        searchLink.click();
        WebElement searchLink2 = driver.findElement(By.linkText("FirefoxDriver"));
        searchLink2.click();

        List<WebElement> searchFirefoxText = driver.findElements(By.linkText("org.openqa.selenium.firefox"));
        Assert.assertEquals(1, searchFirefoxText.size());
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}