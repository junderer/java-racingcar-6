package racingcar.view;

import static racingcar.domain.Constant.START_RACING_CAR_GAME;

import camp.nextstep.edu.missionutils.Console;

public class RacingCarGameView {
    public void startRacingCarGame() {
        System.out.println(START_RACING_CAR_GAME);
    }

    public String getUserInput() {
        String userInput = Console.readLine();
        return userInput;
    }

}
