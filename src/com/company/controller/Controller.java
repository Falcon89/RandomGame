package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void userProcess(){
        // logic
        final Scanner scanner = new Scanner(System.in);

        model.guess(11, System.currentTimeMillis() + 10_000 + 1000);

        view.msg("Hello, the application guessed a number, you are supposed to guess it");

        while (model.amountOfAttempts() > 0) {
            int number = scanner.nextInt();
            switch (model.isCorrectNumber(number)) {
                case EQUAL:
                    view.msg("Congratulate, you won");
                    return;
                case LESS:
                    view.msg("Unfortunately you missed, the guessed number is less");
                    break;
                case MORE:
                    view.msg("Unfortunately you missed, the guessed number is more");
                    break;
            }
            if (System.currentTimeMillis() > model.getTime()) {
                view.msg("\nTimeout!");
                return;
            }
        }
        view.msg("Sorry, but you lose, please try again");

    }
}
