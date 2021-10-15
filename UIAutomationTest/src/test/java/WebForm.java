import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{
    private final String SEARCH = "Apply for a number plate";
    private final String SUBURB = "Sydney 2000";

    @FindBy(xpath = "//div[@id='globalAutosuggest']/input")
    private WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterSearch(){
        this.search.sendKeys(SEARCH);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }
}
