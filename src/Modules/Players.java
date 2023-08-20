package src.Modules;

public class Players {

    private char symbol;
    private String name;
    private PlayerType playerType;

    public Players(char symbol, String name, PlayerType type){
        this.symbol = symbol;
        this.name = name;
        this.playerType = type;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

}
