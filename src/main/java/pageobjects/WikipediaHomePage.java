package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaHomePage {

    @FindBy(id = "searchInput")
    private WebElement searchArea;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    public WikipediaHomePage(WebDriver myDriver){
        PageFactory.initElements(myDriver,this);
    }

    public void searchWord(String wordToSearch){
        searchArea.sendKeys(wordToSearch);
        searchButton.click();
    }

}
