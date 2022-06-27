import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindingElements extends BasePage {


    public FindingElements(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/div/header/div/div/div/div[1]/nav/ul/li[2]/a")
    public  WebElement Login;



    @FindBy(xpath="/html/body/div/form/div/h4/a")
    public  WebElement CeateAnAccountr;

    void FillLoginFom(){
        Login.click();
    }

    void CreateAccount(){CeateAnAccountr.click();
    }


}

