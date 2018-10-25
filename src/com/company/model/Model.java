package com.company.model;

import java.util.Random;

public class Model {
    private static final int LEFT_BOUND = 0;
    private static final int RIGHT_BOUND = 1000;
    private int guessedNumber;
    private int attempts;
    private long time;

    public Answer isCorrectNumber(int number) {
        if (number == this.guessedNumber) {
            return Answer.EQUAL;
        }

        return number < this.guessedNumber ? Answer.MORE : Answer.LESS;
    }

    public int amountOfAttempts() {
        return attempts;
    }

    public long getTime() {
        return time;
    }

    public void guess(int attempts, long time) {
       this.guessedNumber = new Random().nextInt((RIGHT_BOUND - LEFT_BOUND) + LEFT_BOUND);
       this.attempts = attempts;
       this.time = time;
    }

}
