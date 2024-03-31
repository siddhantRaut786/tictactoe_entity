package com.example.tictactoe.strategies.botPlayingStrategies;

import com.example.tictactoe.models.Board;
import com.example.tictactoe.models.Cell;
import com.example.tictactoe.models.Move;
import com.example.tictactoe.models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeNextMove(Board board, Player player) {

        for (List<Cell> row: board.getBoard()) {
            for (Cell cell: row) {
                if (cell.isEmpty()) {
                    Move move = new Move();
                    move.setSymbol(player.getSymbol());
                    move.setPlayer(player);
                    move.setCell(cell);
                    return move;
                }
            }
        }
        return null;
    }
}
