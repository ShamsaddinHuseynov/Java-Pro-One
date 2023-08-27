package Car;

public class Cabrio extends Car {

    public boolean isOpened;

    public Cabrio(int id, String model, String color, int currentSpeed, boolean isOpened) {
        super(id, model, color, currentSpeed);
        this.isOpened = isOpened;
    }
}
