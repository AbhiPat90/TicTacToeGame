package src.Modules;

import com.sun.jdi.BooleanType;
import src.Startegies.BotPlayingStrategy.BotPlayingStrategy;
import src.Startegies.BotPlayingStrategy.EasyBotBplayingStrategy;

public class Bot extends Players {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public Bot(char symbol, String name, BotDifficultyLevel botDifficultyLevel){
        super(symbol,name, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = new EasyBotBplayingStrategy();
    }
    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
