package TestNG;
import
import org.testng.annotations.Test;

public class DependenciaDeMetodos {
    WebDriver driver;

    @Test (groups = "initialize")
    public void test1_SetUpChrome()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver ();

        System.out.println("1. Set Up Chrome");
    }

    @Test (dependsOnMethods = "test1_SetUpChrome")
    public void test2_OpenOrangeHRM()
    {
        //Invalid URL
        driver.get("https://opensource-demo.orangehrmlive1234.com/");

        Assert.assertEquals(false, true, "Could Not Access OrangeHRM");
        System.out.println("2. Open OrangeHRM");
    }

    @Test (dependsOnMethods = "test2_OpenOrangeHRM")
    public void test3_SignIn() {}

    @Test (dependsOnMethods = "test3_SignIn")
    public void test4_SearchUser() {}

    @Test (dependsOnMethods = { "test2_OpenOrangeHRM", "test3_SignIn" } )
    public void test5_SearchEmployee() {}

    @Test (dependsOnMethods = { "test2_OpenOrangeHRM", "test3_SignIn" } )
    public void test6_SearchCandidate() {}

    @Test (dependsOnMethods = { "test2_OpenOrangeHRM", "test3_SignIn" } )
    public void test7_SignOut() {}
}
