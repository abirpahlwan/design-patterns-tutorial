public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType){

        EnemyShip newShip = null;

        if (shipType.equals("U")){
            return new UFOEnemyShip();
        } else if (shipType.equals("R")){
            return new RocketEnemyShip();
        } else if (shipType.equals("B")){
            return new BigUFOEnemyShip();
        } else {
            return null;
        }
    }
}
