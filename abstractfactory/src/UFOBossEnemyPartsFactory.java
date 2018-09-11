public class UFOBossEnemyPartsFactory implements EnemyPartsFactory {
    @Override
    public EnemyShipWeapon addEnemyShipGun() {
        return new UFOBossEnemyShipGun();
    }

    @Override
    public EnemyShipEngine addEnemyShipEngine() {
        return new UFOBossEnemyShipEngine();
    }
}
