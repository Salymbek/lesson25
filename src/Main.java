import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Car, CarInfo> cars = new HashMap<>();
        cars.put(new Car(1,"234 qw"),
                new CarInfo(LocalDate.of(2000,1,1), "Bugatti veyron", BigDecimal.valueOf(1200000), "blue" ));
        cars.put(new Car(2,"678 vk"),
                new CarInfo(LocalDate.of(1997,1,1), "Lamborghini huracan", BigDecimal.valueOf(220000), "black" ));
        cars.put(new Car(3,"932 bn"),
                new CarInfo(LocalDate.of(2022,1,1), "Mercedes Benz S class W124", BigDecimal.valueOf(152000), "red" ));
        cars.put(new Car(4,"235 ds"),
                new CarInfo(LocalDate.of(2003,1,1), "HONDA FIT", BigDecimal.valueOf(12000), "white" ));
        cars.put(new Car(3,"672 dh"),
                new CarInfo(LocalDate.of(2019,1,1), "RENAULT PREMIUM", BigDecimal.valueOf(36000), "grey" ));

        Iterator<Map.Entry<Car, CarInfo>> iterator = cars.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}