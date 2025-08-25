package lowLevelDesign.SnakeLadder;

public class Player {
    String id;
    int currentPosition;

    public Player(String id, int currentPosition){
        this.id=id;
        this.currentPosition=currentPosition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPlayerPosition() {
        return currentPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.currentPosition = playerPosition;
    }
}
