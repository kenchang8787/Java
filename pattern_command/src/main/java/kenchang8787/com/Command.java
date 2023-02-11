package kenchang8787.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Command {

  Light light;

  public abstract void execute();
}
