
public class GameRunner {
    private Mario player;

    GameRunner (Mario player) {
        this.player = player;
    }
    public void run () {
        player.up();
        player.down();
        player.left();
        player.right();
    }
}
