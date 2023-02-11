package kenchang8787.com;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements IObserver {

  /** 用戶名稱 */
  String name;

  /** 更新 */
  @Override
  public void update(String notifyText) {
    System.out.println(name + " 收到了通知: " + notifyText);
  }
}
