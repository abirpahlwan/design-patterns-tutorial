public class UFOBossEnemyShip extends EnemyShip {

    EnemyPartsFactory shipFactory;

    public UFOBossEnemyShip(EnemyPartsFactory shipPartsFactory) {
        this.shipFactory = shipPartsFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addEnemyShipGun();
        engine = shipFactory.addEnemyShipEngine();
    }
}
