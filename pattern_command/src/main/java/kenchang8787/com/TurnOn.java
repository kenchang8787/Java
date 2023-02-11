package kenchang8787.com;

public class TurnOn extends Command {

  public TurnOn(Light light) {
    super(light);
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}
