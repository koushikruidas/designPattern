package Pattern.Behavioral.Command;

public class TvVolDownCommand implements Command {
    Tv tv;
    public TvVolDownCommand(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.decreaseVolume();
    }
}
