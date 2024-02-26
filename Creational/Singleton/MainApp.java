package Pattern.Creational.Singleton;

public class MainApp {

    public static void main(String[] args) {
        Database o1 = Database.INSTANCE;
        Database o2 = Database.INSTANCE;

        if (o1 == o2){
            o1.connect();
        }
    }
}
