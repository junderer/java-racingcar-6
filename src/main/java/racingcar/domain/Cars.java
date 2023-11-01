package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(String userInput) {
        cars = makeCarList(userInput);
    }

    public List<Car> makeCarList(String userInput){
        String[] carNameList = userInput.split(",");
        List<Car> carList = new ArrayList<>();

        for (String carName : carNameList) {
            Car car = new Car(carName);
            carList.add(car);
        }

        return carList;
    }



}
