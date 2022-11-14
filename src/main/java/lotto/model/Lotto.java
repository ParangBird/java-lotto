package lotto.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;
    public static final int LOTTO_NUMBER_MIN = 1;
    public static final int LOTTO_NUMBER_MAX = 45;
    public static final int LOTTO_LENGTH = 6;
    public static final String LOTTO_DELIMITER = ",";
    public static final int LOTTO_FIRST_REWARD = 2000000000;
    public static final int LOTTO_SECOND_REWARD = 30000000;
    public static final int LOTTO_THIRD_REWARD = 15000000;
    public static final int LOTTO_FOURTH_REWARD = 50000;
    public static final int LOTTO_FIFTH_REWARD = 5000;
    public static final int LOTTO_LOSE_REWARD = 0;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i : numbers) {
            if ((i >= LOTTO_NUMBER_MIN && i <= LOTTO_NUMBER_MAX)) {
                numberSet.add(i);
            }
        }

        if (numbers.size() != LOTTO_LENGTH || numberSet.size() != LOTTO_LENGTH) {
            throw new IllegalArgumentException();
        }


    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
