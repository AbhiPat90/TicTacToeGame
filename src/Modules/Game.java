package src.Modules;

import src.Exceptions.InvalidGameDimensionException;
import src.Exceptions.PlayersSizeNoSufficient;

import java.util.LinkedList;
import java.util.List;

public class Game {
    private Board board;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    private List<Players> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private Players winningPlayer;

    public Players getWinningPlayer() {
        return winningPlayer;
    }

    public void setWinningPlayer(Players winningPlayer) {
        this.winningPlayer = winningPlayer;
    }

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public static class GameBuilder{
        private int dimension;
        private List<Players> players;

        public GameBuilder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public GameBuilder setPlayers(List<Players> players) {
            this.players = players;
            return this;
        }

        public Game build(){
            try{
                isValid();
            }catch(InvalidGameDimensionException igde){
                System.out.println("Exception related to board dimension has occurred:");
                return null;
            }catch(PlayersSizeNoSufficient psns){
                System.out.println("Exception related to players count has occurred:");
                return null;
            }

            Game game = new Game();
            game.setBoard(new Board(dimension));
            game.setPlayers(players);
            game.setMoves(new LinkedList<>());
            game.setNextPlayerIndex(0);

            return game;
        }

        private void isValid() throws InvalidGameDimensionException, PlayersSizeNoSufficient {
            if(dimension < 3){
                throw new InvalidGameDimensionException("Minimum dimension allowed is 3");
            }

            if(players.size() < 2){
                throw new PlayersSizeNoSufficient("Players count should be at least 2 to play a game");
            }
        }



    }
}
