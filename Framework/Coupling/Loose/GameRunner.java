
public class GameRunner {
    private Console player;

    GameRunner (Console player) {
        this.player = player;
    }
    public void run () {
        player.up();
        player.down();
        player.left();
        player.right();
    }
}
