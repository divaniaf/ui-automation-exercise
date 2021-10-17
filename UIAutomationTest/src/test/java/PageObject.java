import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
    PageFactory to create test pages with the same mechanism,
    PageFactory approach here that extends the PageObject model
*/

public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
