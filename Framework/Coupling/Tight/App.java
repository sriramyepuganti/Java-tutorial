
public class App {
    public static void main(String[] args) {
        // In below Game runner is tighly coupled to Mario class
        // if you want to run it for packman. we have to modify the Gamerunner class
        Mario game1 = new Mario();
        GameRunner platform1 = new GameRunner(game1);
        platform1.run();

        PackMan game2 = new PackMan();
        // GameRunner platform2 = new GameRunner(game2); // throws error
    }
}
