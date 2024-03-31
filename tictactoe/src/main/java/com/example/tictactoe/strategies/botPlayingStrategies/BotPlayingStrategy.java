package com.example.tictactoe.strategies.botPlayingStrategies;

import com.example.tictactoe.models.Board;
import com.example.tictactoe.models.Move;
import com.example.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board, Player player);
}
