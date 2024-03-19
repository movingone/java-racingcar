package carRacingWinner.domain;

public class Car {
    private String name;
    private static final String CAR_LOCATION_DISPLAY = "-";
    int location;

    public Car(String name) {
        new Car(name, 0);
    }

    public Car(String name, int location) {
        if(name.length() > 5)
            throw new IllegalArgumentException("차량의 이름이 너무 깁니다.");
        this.name = name;
        this.location = location;
    }


    public void move(int randomValue) {
        if (randomValue > 4)
            location++;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void print() {
        System.out.print(name + " : ");
        for (int i = 0; i <= location; i++) {
            System.out.print(CAR_LOCATION_DISPLAY);
        }
        System.out.println();
    }
}