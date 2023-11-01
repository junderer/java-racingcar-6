package racingcar.domain;

import static racingcar.domain.Constant.CAR_NAME_MAX_LENGTH;
import static racingcar.domain.Constant.CAR_NAME_OUT_OF_LENGTH;

public class Car {
    private String carName;

    public Car(String carName) {
        validateLength(carName);
        this.carName = carName;
    }


    private void validateLength(String carName){
        if(carName.length() > CAR_NAME_MAX_LENGTH){
            throw new IllegalArgumentException(CAR_NAME_OUT_OF_LENGTH);
        }

    }



}
