import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void carArrayTest() {

        Car myCar = new Car();
        myCar.anArrayOfCars();
    }

    @Test
    public void carListTest() {

        Car myCar = new Car();
        myCar.aListOfCars();
    }

    @Test
    public void isItalianPositiveTest() {

        // Arrange - Create a new instance of the Car class with prespecified property values
        Car myCar = new Car("Maserati","Ghibli","blue");

        // Act - Invoke the method to be tested
        boolean isItalian = myCar.isItalian();

        // Assert - Check that the result of the method invocation matches the expected result
        Assert.assertTrue(isItalian);
    }

    @Test
    public void ifThenElseTest() {

        Car myCar = new Car("Fiat","Punto","red");

        if(myCar.isItalian()) {
            System.out.println("Buongiorno!");
        }
        else {
            System.out.println("Hello!");
        }
    }

    private String getFruit() {

        return "banana";
    }

    @Test
    public void whileTest() {

        int counter = 0;

        while(counter < 5) {
            System.out.println(String.format("And a %d...", counter));
            counter++;
        }
    }

}
