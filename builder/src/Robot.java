public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String robotHead) {
        this.robotHead = robotHead;
    }

    public String getRobotHead() {
        return robotHead;
    }

    @Override
    public void setRobotTorso(String robotTorso) {
        this.robotTorso = robotTorso;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    @Override
    public void setRobotArms(String robotArms) {
        this.robotArms = robotArms;
    }

    public String getRobotArms() {
        return robotArms;
    }

    @Override
    public void setRobotLegs(String robotLegs) {
        this.robotLegs = robotLegs;
    }

    public String getRobotLegs() {
        return robotLegs;
    }
}
