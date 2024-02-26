package Pattern.Behavioral.Command;

public class TempDownCommand implements Command {
    Thermostat thermostat;
    public TempDownCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public void execute() {
        thermostat.decreaseTemp();
    }
}
