import com.milkshake.IceCream;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IceCreamTest {

    @Test
    public void TestIfObjectIsNull() {
        Assert.assertNull(IceCream.Strachatela());
    }

    @Test
    public void TestIfObjectIsNotNull() {
        Assert.assertNotNull(IceCream.Nutela());
    }
}


