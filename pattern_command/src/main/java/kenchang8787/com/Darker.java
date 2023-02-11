package kenchang8787.com;

public class Darker extends Command {

  public Darker(Light light) {
    super(light);
  }

  @Override
  public void execute() {
    this.light.darker();
  }
}
