package src;

import src.Controller.GameController;
import src.Modules.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Lets play a game called Tic Tac Toe.. :) ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of the game:");
        int dimension = sc.nextInt();

        System.out.println("Enter the no of players playing the game: ");
        int noOfPlayers = sc.nextInt();

        System.out.println("Is bot playing the game? Enter y/n: ");
        String isBotPlaying = sc.next();

        List<Players> players = new LinkedList<>();

        if(isBotPlaying.equalsIgnoreCase("y")){
            noOfPlayers = noOfPlayers - 1;

            System.out.println("Enter the symbol for the bot: ");
            String botSymbol = sc.next();

            System.out.println("Enter the name of the bot: ");
            String botName = sc.next();

            System.out.println("Enter the bot difficulty level: 1 - Easy, 2 - Medium, 3 - Hard");
            int difficultyLevel = sc.nextInt();

            players.add(new Bot(botSymbol.charAt(0), botName, BotDifficultyLevel.fromValue(difficultyLevel)));

        }

        for(int i = 0; i < noOfPlayers; i++){
            System.out.println("Enter the name of the player:");
            String name = sc.next();

            System.out.println("Enter the symbol of the player:");
            String symbol = sc.next();

            Players player = new Players(symbol.charAt(0), name, PlayerType.HUMAN);
            players.add(player);
        }

//        Game game = Game.getBuilder()
//                        .setDimension(dimension)
//                        .setPlayers(players)
//                .build();

        GameController gameController = new GameController();
        Game game = gameController.getGameController(dimension, players);

        while(gameController.getGameStatus(game) == GameStatus.IN_PROGRESS){
            // Game is going on
            break;
        }

        if(game.getGameStatus() == GameStatus.WIN){
            System.out.println("Winning Player: "+ gameController.getWinningPlayer(game));
        }else{
            System.out.println("Game has drawn");
        }
    }
}
