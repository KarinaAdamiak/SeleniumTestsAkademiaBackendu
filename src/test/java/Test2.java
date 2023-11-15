import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test2 extends SearchBarPage {
    private SearchBarPage searchBarPage;
    static WebDriver driver;

    public Test2(WebDriver driver) {
        super(driver);
    }


    //  }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        searchBarPage= new SearchBarPage(driver);

    }
        @Test
        public void shouldFindItemAndCheckItsName(){
            searchBarPage.typeIntoSearchBar();
            searchBarPage.clickSearchButton();
            searchBarPage.getProductName();
            String productName=searchBarPage.getProductName();
            String name="Blouse";
            Assertions.assertThat(productName).isEqualTo(name);
























        /*WebElement searchBar = driver.findElement(By.id("search_query_top"));

        searchBar.sendKeys(productNameSearch);

        WebElement magnifyingGlass = driver.findElement(By.className("button-search"));
        magnifyingGlass.click();

        WebElement productName= driver.findElement(By.cssSelector("[title='Blouse']"));
       ;*/




}}
