package src.Modules;

import java.util.HashMap;
import java.util.Map;

public enum BotDifficultyLevel {
    EASY(1),
    HARD(2),
    MEDIUM(3);

    private final int value;
    private static final Map<Integer, BotDifficultyLevel> reverseMap;

    static {
        reverseMap = new HashMap<>();
        for(BotDifficultyLevel level : BotDifficultyLevel.values()){
            reverseMap.put(level.value, level);
        }
    }
    BotDifficultyLevel(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static BotDifficultyLevel fromValue(int value){
        return reverseMap.get(value);
    }

}
