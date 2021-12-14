package Sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\KETAKI\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver cdriver = new ChromeDriver();
            facebookLogin(cdriver);

        }
        static void facebookLogin(WebDriver cdriver) throws InterruptedException {
            cdriver.get("https://www.facebook.com");
            Thread.sleep(2000);
            cdriver.manage().window().maximize();
            WebElement user = cdriver.findElement(By.id("email"));
            //add your emailid
            user.sendKeys("add your email");
            WebElement pass = cdriver.findElement(By.id("pass"));
            // add your password
            pass.sendKeys("pass");
            WebElement next = cdriver.findElement(By.name("login"));
            next.click();

            //validation
            String appTitle=cdriver.getTitle();
            String expTitle="Facebook – log in or sign up";
            System.out.println(appTitle);
            if (appTitle.equals (expTitle)){
                System.out.println("Verification Successfull");
            }
            else{
                System.out.println("Verification Failed");

            }

        }

    }




