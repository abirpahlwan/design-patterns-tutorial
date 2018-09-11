public abstract class EnemyShip {

    private String name;
    EnemyShipWeapon weapon;
    EnemyShipEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeShip();

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen.");
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero.");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + weapon.getDamageAmount() + " damage.");
    }

    public String toString(){
        String shipInfo = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
        return shipInfo;
    }

}
