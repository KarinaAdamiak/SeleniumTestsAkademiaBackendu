import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test1 extends WomenTabPage {

//PageObject-> dodajemy page-object
static WebDriver driver;
public Test1(WebDriver driver) {

        super(driver);
}
private WomenTabPage womenTabPage;



    @BeforeEach
    public void setUpTests(){
        driver.get("http://www.automationpractice.pl/index.php");

        driver=new ChromeDriver();
        driver.manage().window().maximize();
    //Inicjalizujemy Konstruktor z page object
        womenTabPage= new WomenTabPage(driver);

    }


   @BeforeAll
    static void prepareTheBrowser() {
        WebDriverManager.chromedriver().setup();


    }




    @Test
    public void shouldCheckAllPrices(){

        womenTab.click();
      //  womenTabPage.isListVisible();
        womenTabPage.getProductsNamesList();
        womenTabPage.getProductsPrices();


















    }

    }






