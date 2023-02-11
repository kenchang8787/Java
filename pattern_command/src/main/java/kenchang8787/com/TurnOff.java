package kenchang8787.com;

public class TurnOff extends Command {

  public TurnOff(Light light) {
    super(light);
  }

  @Override
  public void execute() {
    this.light.turnOn();
  }
}
