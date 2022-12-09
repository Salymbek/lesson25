import java.math.BigDecimal;
import java.time.LocalDate;

public class CarInfo {
    private LocalDate yearOfIssue;
    private String model;
    private BigDecimal price;
    private String colour;

    public CarInfo(LocalDate yearOfIssue, String model, BigDecimal price, String colour) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getYearOfIssue() {
        return yearOfIssue.getYear();
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "  \nCarInfo: " +
                "\nyearOfIssue: " + getYearOfIssue() +
                "\nmodel: " + model +
                "\nprice: $" + getPrice() +
                "\ncolour: " + colour +
                "\n\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n";
    }
}