public class Test {
    public static void main(String[] args) {

        DiceGame game = new DiceGame();
        boolean checkGame = false;
        int counter = 0;

        for (int i = 0; i < 100; i++){
            while (!checkGame) {
                checkGame = game.play();
                counter++;
            }
            System.out.println("The number of times the game ran, before the two dice had the same faceValue, was: "
                    + counter);
            checkGame = false;
            counter = 0;
        }
    }
}
