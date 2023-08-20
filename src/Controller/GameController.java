package src.Controller;

import src.Modules.Game;
import src.Modules.GameStatus;
import src.Modules.Players;

import java.util.LinkedList;
import java.util.List;

public class GameController {

    public Game getGameController(int dimension, List<Players> players){
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public String getWinningPlayer(Game game){
        return game.getWinningPlayer().getName();
    }

    public void getNextMove(Game game){

    }

    public void undo(Game game){

    }
}
