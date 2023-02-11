package kenchang8787.com;

public class Brighter extends Command {

  public Brighter(Light light) {
    super(light);
  }

  @Override
  public void execute() {
    this.light.brighter();
  }
}
