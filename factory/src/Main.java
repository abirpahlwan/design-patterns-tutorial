import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";
        System.out.println("What type of enemy ship? (U / R)");
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if (enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        } else if (enemyShipOption.equals("R")){
            theEnemy = new RocketEnemyShip();
        }

        doStuffEnemy(theEnemy);*/

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of enemy ship? (U / R / B)");
        if(userInput.hasNextLine()){
            String shipType = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(shipType);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Error!");
        }

    }

    private static void doStuffEnemy(EnemyShip enemyShip) {

        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
