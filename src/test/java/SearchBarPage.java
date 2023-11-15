import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarPage {

    public SearchBarPage(WebDriver driver) {
    PageFactory.initElements(driver, this);

    }
    @FindBy(id = "search_query_top")
    WebElement searchBar;

    @FindBy(css = "button-search")
    WebElement searchButton;

    @FindBy(css = "[title='Blouse']")
    WebElement productname;



    public void typeIntoSearchBar() {
        String productNameSearch = "Blouse";
        searchBar.sendKeys(productNameSearch);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
    public String getProductName() {
        String productNameText = productname.getText();
        return productNameText;
    }}



