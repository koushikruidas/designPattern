package Pattern.Behavioral.Command;

public class TempUpCommand implements Command {
    Thermostat thermostat;
    public TempUpCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public void execute() {
        thermostat.increaseTemp();
    }
}
