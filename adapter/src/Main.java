public class Main {

    public static void main(String[] args) {

        EnemyTank rx51Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");
        fredTheRobot.reactToHuman("Abir");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("The Enemy Tank");
        rx51Tank.assignDriver("Frank");
        rx51Tank.driveForward();
        rx51Tank.fireWeapon();

        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("Tony");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
