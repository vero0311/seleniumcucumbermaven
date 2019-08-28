package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearch {

    @FindBy(id = "firstHeading")
    private WebElement titleOfSearching;

    public WikipediaSearch(WebDriver myDriver){
        PageFactory.initElements(myDriver,this);
    }

    public String identifyCorrectTitle(){
        return titleOfSearching.getText().toString();
    }
}
