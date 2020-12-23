package TestNG;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerificacionIniciar {
    @BeforeClass
    public void setUp() {}

    @Test
    public void signIn() {}

    @Test
    public void testHomePageVerification() {
        Assert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
        System.out.println("3. Verify Welcome Link");

        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        System.out.println("4. Verify Admin Tab");

        Assert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
        System.out.println("5. Verify Dashboard");
    }

    @Test
    public void userSearch() {}

    @Test
    public void userSignOut() {}

    @AfterClass
    public void tearDown() {}
}
