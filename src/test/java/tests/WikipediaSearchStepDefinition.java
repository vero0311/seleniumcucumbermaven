package tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.WikipediaHomePage;
import pageobjects.WikipediaSearch;
import static org.junit.Assert.*;

public class WikipediaSearchStepDefinition implements En {

    private WebDriver myDriver;
    private WikipediaHomePage wikipediaHomePage;
    private WikipediaSearch wikipediaSearch;
    public final static String WIKIPEDIA_URL = "https://es.wikipedia.org/wiki/Wikipedia:Portada";

    @Before
    public void setup() {
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        myDriver = new ChromeDriver();
        wikipediaHomePage = new WikipediaHomePage(myDriver);
        wikipediaSearch = new WikipediaSearch(myDriver);
    }

   // @After
  //  public void finishTest(){
  //      myDriver.close();
   // }

    public WikipediaSearchStepDefinition() {
        Given("That I am in Wikipedia home page", () -> {
            myDriver.get(WIKIPEDIA_URL);
        });

        When("I search {string}", (String wordToSearch) -> {
            wikipediaHomePage.searchWord(wordToSearch);
        });

        Then("I hope to see the title {string}", (String titleExpected) -> {
            assertEquals(titleExpected,wikipediaSearch.identifyCorrectTitle());
        });
    }
}