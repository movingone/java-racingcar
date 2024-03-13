package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static racingcar.CarRacing.*;

class CarRacingTest {

    @Test
    @DisplayName("차량수 반복수 확인")
    public void CarAndTry() {
        int Cars = 10;
        int Try = 5;
        assertThat(CarCount(Cars)).isEqualTo(10);
        assertThat(MoveCount(Try)).isEqualTo(5);
        makeCars(Cars);

        assertThat(cars.length).isEqualTo(10);
    }

    @Test
    @DisplayName("차량 움직임 랜덤수")
    public void GoStop() {

        int[] value = {1, 0, -1, 10, 3, 2, 7, 3, 4};
        int condition = 5;
        int cnt = 0;

        for (int i : value) {
            if (i >= condition)
                cnt++;
        }
        assertThat(cnt).isEqualTo(2);
    }

    @Test
    @DisplayName("차량 위치 출력")
    public void location() {
        List<Character> car = new LinkedList<>();
        car.add('-');
        car.add('-');
        car.add('-');

        CarLocation(car);
    }

    @Test
    @DisplayName("차량들 전체 현재위치")
    public void totalLocation() {
        makeCars(5);
        MoveCar(cars);
    }
}