import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Golf", 1999));
        cars.add(new Car("Astra", 2005));
        cars.add(new Car("E36", 1984));
        cars.add(new Car("911", 1990));
        cars.add(new Car("Tiguan", 2018));
        cars.add(new Car("126P", 1974));
        cars.add(new Car("Supra", 1999 ));
        cars.add(new Car("350Z", 2002));
        cars.add(new Car("Superb", 2020));
        cars.add(new Car("Megane", 2018));
        Collections.sort(cars);
        for(Car car : cars) {
            System.out.println(car.year);
    }}}