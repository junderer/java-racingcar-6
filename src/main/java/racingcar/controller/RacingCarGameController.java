package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.RacingCarGameView;

public class RacingCarGameController {
    private final RacingCarGameView racingCarGameView;

    public RacingCarGameController() {
        racingCarGameView = new RacingCarGameView();
    }

    public void startRacingCarGame() {
        racingCarGameView.startRacingCarGame();
        String userInput = racingCarGameView.getUserInput();
        Cars cars = new Cars(userInput);
        racingCarGameView.askTryNumber();
        String userTryNumberInput = racingCarGameView.getUserInput();
    }
}
