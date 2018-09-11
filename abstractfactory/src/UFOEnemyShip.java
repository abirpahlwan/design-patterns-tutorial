public class UFOEnemyShip extends EnemyShip {

    EnemyPartsFactory shipFactory;

    public UFOEnemyShip(EnemyPartsFactory shipPartsFactory) {
        this.shipFactory = shipPartsFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addEnemyShipGun();
        engine = shipFactory.addEnemyShipEngine();
    }
}
