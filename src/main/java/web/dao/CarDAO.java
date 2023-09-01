package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {

    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "Batmobile for Adam West", "1966"));
        cars.add(new Car(++CAR_COUNT, "Batmobile for Michael Keaton", "1989"));
        cars.add(new Car(++CAR_COUNT, "Batmobile for Val Kilmer", "1995"));
        cars.add(new Car(++CAR_COUNT, "Batmobile for Christian Bale", "2008"));
        cars.add(new Car(++CAR_COUNT, "Batmobile for Ben Affleck", "2016"));
    }

    public List<Car> fullList() {
        return cars;
    }

    public List<Car> sortList(int count) {
        return cars.subList(0, Math.min(cars.size(), count));
    }
}
