public class IronManRobotBuilder implements RobotBuilder {

    private Robot robot;

    public IronManRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Flipping Mask Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Iron Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Detachable Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Jet-fuel Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
