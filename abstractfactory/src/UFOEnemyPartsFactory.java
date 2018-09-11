public class UFOEnemyPartsFactory implements EnemyPartsFactory {
    @Override
    public EnemyShipWeapon addEnemyShipGun() {
        return new UFOEnemyShipGun();
    }

    @Override
    public EnemyShipEngine addEnemyShipEngine() {
        return new UFOEnemyShipEngine();
    }
}
