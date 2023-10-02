import com.milkshake.Milkshake;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MilkshakeTest {

    @Test
    public void testForVerifyPriceOfTwoShakes1() {
        Assert.assertEquals(Milkshake.AreEqual(Milkshake.Price(Milkshake.MilkshakeChocolate, Milkshake.Caramel), Milkshake.Price(Milkshake.MilkshakeChocolate, Milkshake.Nuts)), false);
    }

    @Test
    public void VerifyThatThePriceIsNotTheSameForTwoShakes() {
        Assert.assertNotEquals(Milkshake.AreEqual(Milkshake.Price(Milkshake.MilkshakeChocolate, Milkshake.Almonds), Milkshake.Price(Milkshake.MilkshakeChocolate, Milkshake.Caramel)), true);
    }

    @Test
    public void VerifyIfItemsHaveValuesAndAreNotEmpty() {
        Assert.assertTrue(Milkshake.MilkCaramel(Milkshake.MilkshakeChocolate, Milkshake.Caramel));
    }

    @Test
    public void testForVerifyPriceOfTwoShakes2() {
        Assert.assertEquals(Milkshake.AreEqual(Milkshake.Price(Milkshake.MilkshakeChocolate, Milkshake.Almonds), Milkshake.Price(Milkshake.MilkshakeChocolate, Milkshake.Pistachios)), true);
    }
}
