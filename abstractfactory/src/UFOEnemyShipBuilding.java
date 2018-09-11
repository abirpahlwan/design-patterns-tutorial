public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        if(typeOfShip.equals("UFO")){
            EnemyPartsFactory shipPartsFactory = new UFOEnemyPartsFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        }
        else if(typeOfShip.equals("UFO BOSS")){
            EnemyPartsFactory shipPartsFactory = new UFOBossEnemyPartsFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");
        }

        return theEnemyShip;
    }
}
