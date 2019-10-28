import java.util.*;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car() {

        this.make = "default make";
        this.model = "default model";
        this.color = "default color";
    }

    public Car(String make, String model, String color) {

        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String printInfo() {

        return String.format("I'm a %s %s %s", this.color, this.make, this.model);
    }

    public boolean isItalian() {

        List<String> italianCarsList = Arrays.asList("Fiat", "Alfa Romeo", "Lancia", "Maserati", "Ferrari");
        return italianCarsList.contains(this.make);
    }
}
