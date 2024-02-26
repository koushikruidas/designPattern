package Pattern.Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        /**
         * https://www-geeksforgeeks-org.cdn.ampproject.org/v/s/www.geeksforgeeks.org/command-pattern/amp/?amp_gsa=1&amp_js_v=a9&usqp=mq331AQIUAKwASCAAgM%3D#amp_tf=From%20%251%24s&aoh=17081777562911&referrer=https%3A%2F%2Fwww.google.com&ampshare=https%3A%2F%2Fwww.geeksforgeeks.org%2Fcommand-pattern%2F
         */
        Tv tv = new Tv();
        Thermostat thermostat = new Thermostat();
        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command turnOnThermostat = new TurnOnCommand(thermostat);
        Command turnOffThermostat = new TurnOffCommand(thermostat);
        Command tempUp = new TempUpCommand(thermostat);
        RemoteControl rc = new RemoteControl();
        rc.setCommand(turnOffThermostat);
        rc.press();
        rc.setCommand(turnOn);
        rc.press();
    }
}
