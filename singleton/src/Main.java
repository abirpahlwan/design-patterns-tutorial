import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player One: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());


        Singleton secondInstance = Singleton.getInstance();

        System.out.println("Instance 2 ID: " + System.identityHashCode(secondInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);

        System.out.println("Player Two: " + playerTwoTiles);

        System.out.println(secondInstance.getLetterList());
    }
}
