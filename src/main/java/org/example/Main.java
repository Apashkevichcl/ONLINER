
import org.openqa.selenium.chrome.ChromeDriver;


public class Main{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\AQA\\chromedriver_win32\\chromedriver.exe");
        Webdriver  driver = new ChromeDriver();
        driver.get ("https://www.onliner.by/")
    }
}