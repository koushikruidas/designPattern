package Pattern.Behavioral.Command;

public class TvVolUpCommand implements Command {
    Tv tv;
    public TvVolUpCommand(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.increaseVolume();
    }
}
