package carRacingWinner.repository;

import carRacingWinner.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WinnerRepository {

    private List<Car> cars;

    private void createCars() {
        this.cars = new ArrayList<>();
    }

    public void addCar(String name) {
        if (cars == null)
            createCars();
        this.cars.add(new Car(name));
    }



    public List<Car> getCars() {
        return cars;
    }

    public void makeCars(List<String> names) {
        if (cars == null)
            createCars();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public void moveCars() {
        for (Car car : cars) {
            car.move(moveChance());
        }
    }

    private int moveChance() {
        return new Random().nextInt(9);
    }
}
