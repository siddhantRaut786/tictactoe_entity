package com.example.tictactoe.strategies.gameWinningStrategies;

import com.example.tictactoe.models.Board;
import com.example.tictactoe.models.Cell;
import com.example.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkIfWon(Board board, Player player, Cell moveCell);
}
