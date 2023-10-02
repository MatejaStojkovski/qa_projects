import org.testng.annotations.*;

public class Homework {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Open application");
    }
    @BeforeMethod
    public static void beforeMethod() {
        System.out.println("Sign in");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Close application");
    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("Sign out");
    }
    @Test(priority = 10)
    public static void test1(){
        System.out.println("Search item");
    }
    @Test (priority = 20)
    public static void test2(){
        System.out.println("Add item to card");
    }
}

