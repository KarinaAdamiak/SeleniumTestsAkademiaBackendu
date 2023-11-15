
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.stream.Collectors;

public class WomenTabPage{
    //Utwórz konstruktor i użyj PageFactory musimy też jako parametr podać driver
  //  private WebDriverWait wait;

    public WomenTabPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    @FindBy(xpath = ".//a[@title='Women']")
    WebElement womenTab;

    @FindBy(xpath = ".//ul[@class='product_list grid row']")
    List<WebElement> products;

    @FindBy(css = "span[class='price product-price']")
    List<WebElement> prices;



    public List<String>getProductsNamesList() {
        return products.stream()
                .map(el -> el.getText())
                .collect(Collectors.toList());
    }
        public List<String>getProductsPrices() {
           return prices.stream()
                    .map(el -> el.getText().replace("$", " "))
                    .collect(Collectors.toList());

    }
    //public boolean isListVisible() {
          //  wait.until(ExpectedConditions.visibilityOfAllElements(products));
          //  return getProductsNamesList().containsAll(products);



        }











