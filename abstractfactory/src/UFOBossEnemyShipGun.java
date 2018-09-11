public class UFOBossEnemyShipGun implements EnemyShipWeapon {

    private final float damageAmount;

    public UFOBossEnemyShipGun(){
        this.damageAmount = 40.0f;
    }

    public double getDamageAmount() {
        return damageAmount;
    }

    public String toString(){
        return String.valueOf(damageAmount);
    }
}
