import java.util.List;

public class TurnItAllOff implements Command{

    List<ElectronicDevice> allDevices;

    public TurnItAllOff(List<ElectronicDevice> allDevices) {
        this.allDevices = allDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : allDevices){
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : allDevices){
            device.on();
        }
    }
}
