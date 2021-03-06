package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title=\"Szukaj\"]")
    static WebElement inputFiled;

    @FindBy(css = "input[value=\"Szukaj w Google\"]")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    @FindBy(css = "//*[@id=\"introAgreeButton\"]/span/span")
    static WebElement alertAccepted;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        PageFactory.initElements(driver, GoogleSearch.class);
        inputFiled.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        driver.close();
    }

    public static GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click(); TODO
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
