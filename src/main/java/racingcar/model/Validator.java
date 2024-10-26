package racingcar.model;

import java.util.List;

public class Validator {

    public void validateInputString(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다.");
        }
    }

    public void validateCountOfCars(Cars cars) {
        if(cars.getCars().size() < 2) {
            throw new IllegalArgumentException("최소 2개 이상의 자동차가 필요합니다.");
        }
    }

    public void validateRoundNumber(String number) {
        try {
            long l = Long.parseLong(number);
            if(l < 1) {
                throw new IllegalArgumentException("시도 횟수는 양수를 입력해주세요.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수를 올바르게 입력해주세요.");
        }
    }
}
