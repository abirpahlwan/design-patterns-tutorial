public class UFOEnemyShipGun implements EnemyShipWeapon {

    private final float damageAmount;

    public UFOEnemyShipGun(){
        this.damageAmount = 20.0f;
    }

    public double getDamageAmount() {
        return damageAmount;
    }

    public String toString(){
        return String.valueOf(damageAmount);
    }
}
