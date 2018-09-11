public class Main {

    public static void main(String[] args) {
        // Odd-Bot
        RobotBuilder oddRobot = new OddRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oddRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());


        // Iron-Man
        RobotBuilder ironManRobot = new IronManRobotBuilder();

        robotEngineer = new RobotEngineer(ironManRobot);

        robotEngineer.makeRobot();

        Robot ironRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + ironRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + ironRobot.getRobotTorso());
        System.out.println("Robot Arm Type: " + ironRobot.getRobotArms());
        System.out.println("Robot Leg Type: " + ironRobot.getRobotLegs());
    }
}
