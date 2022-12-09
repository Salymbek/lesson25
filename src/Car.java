public class Car {
    private int id;
    private String numberOfTheCar;

    public Car(int id, String numberOfTheCar) {
        this.id = id;
        this.numberOfTheCar = numberOfTheCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfTheCar() {
        return numberOfTheCar;
    }

    public void setNumberOfTheCar(String numberOfTheCar) {
        this.numberOfTheCar = numberOfTheCar;
    }

    @Override
    public String toString() {
        return "\nCar" +
                " id: " + id +
                "\nnumber of the car: " + numberOfTheCar + "\n";
    }
}