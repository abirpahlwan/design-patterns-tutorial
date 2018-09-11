public abstract class EnemyShip {

    private String name;
    private double damageAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamageAmount() {
        return damageAmount;
    }

    public void setDamageAmount(double damageAmount) {
        this.damageAmount = damageAmount;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero.");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen.");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamageAmount() + " damage.");
    }
}
