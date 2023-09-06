import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {
    public WebDriver driver;



    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
     // Open https://www.google.com

        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(500);

    }

    @Test
    public void search()throws InterruptedException {
        WebElement searchInput = driver.findElement(By.name("q"));

        // Step 1: Search for the first keyword
        searchInput.sendKeys("what is the meaning of power");
        searchInput.sendKeys(Keys.RETURN);

        // step 2: Remove the keyword and search for a new one
        searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys("foodics");
        searchInput.sendKeys(Keys.RETURN);

       /* //Step 3: Assert the number of results on the UI
       WebElement resultsCount = driver.findElement(By.id("resultStats"));
        System.out.println("Number of results on the first page:");
        resultsCount.getText();
        Thread.sleep(5000);
*/
       // step4: Scroll down and go to the next page
        driver.findElement(By.tagName("body")).sendKeys(Keys.END);
        WebElement nextPageButton = driver.findElement(By.id("pnnext"));
        nextPageButton.click();
        Thread.sleep(500);

    /*    WebElement resultsCountPage2 = driver.findElement(By.id("resultStats"));
        System.out.println("Number of results on the second page: " + resultsCountPage2.getText());

*/

      /*  // Step 6: Validate there are different search suggestions displayed at the end of the page
        java.util.List<WebElement> searchSuggestions = driver.findElements(By.cssSelector(".sbl1"));
        System.out.println("Search suggestions on the second page:");
        for (WebElement suggestion : searchSuggestions) {
            System.out.println(suggestion.getText());
        }
        Thread.sleep(5000);
*/


    }



    @AfterTest
    public void closeBrowser()throws InterruptedException{
        driver.quit();


    }



}
