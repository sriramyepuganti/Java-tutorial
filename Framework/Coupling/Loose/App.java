
public class App {
    public static void main(String[] args) {
        // In below Game runner is loosely coupled to Mario, Pack man class
        Mario game1 = new Mario();
        GameRunner platform1 = new GameRunner(game1);
        platform1.run();

        PackMan game2 = new PackMan();
        GameRunner platform2 = new GameRunner(game2);
        platform2.run();
    }
}
