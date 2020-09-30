import org.junit.*;

public class CarTest {

    @Test
    public void ditIsEenVeelBetereTestNaam() {

        // Arrange - Create a new instance of the Car class with prespecified property values
        Car myCar = new Car("Maserati","Ghibli","blue");

        // Act - Invoke the method to be tested
        boolean isItalian = myCar.isItalian();

        // Assert - Check that the result of the method invocation matches the expected result
        Assert.assertTrue(isItalian);
    }

    @Test
    public void dezeIsEchtNogVeelZin() throws Exception {

        // Arrange - Create a new instance of the Car class with prespecified property values
        Car myCar = new Car("Ford","Focus","black");

        // Act - Invoke the method to be tested
        boolean isItalian = myCar.isItalian();

        // Assert - Check that the result of the method invocation matches the expected result
        Assert.assertFalse(isItalian);
    }
}
