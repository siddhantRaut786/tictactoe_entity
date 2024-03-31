package com.example.tictactoe.factories;

import com.example.tictactoe.models.BotDifficultyLevel;
import com.example.tictactoe.strategies.botPlayingStrategies.BotPlayingStrategy;
import com.example.tictactoe.strategies.botPlayingStrategies.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public BotPlayingStrategy createBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {

//        BotPlayingStrategy strategy = null;
//
//        switch (difficultyLevel) {
//            case EASY ->
//        }

        return switch (difficultyLevel) {
            case EASY, MEDIUM, HARD -> new RandomBotPlayingStrategy();
        };
    }
}
