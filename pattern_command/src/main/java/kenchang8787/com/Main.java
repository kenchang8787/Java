package kenchang8787.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Command> invoker = new ArrayList<>();

    Light light = new Light();

    invoker.add(new TurnOn(light));
    invoker.add(new Brighter(light));
    invoker.add(new Brighter(light));
    invoker.add(new Darker(light));
    invoker.add(new Darker(light));
    invoker.add(new TurnOn(light));

    // execute.
    for (Command c : invoker) c.execute();
  }
}
