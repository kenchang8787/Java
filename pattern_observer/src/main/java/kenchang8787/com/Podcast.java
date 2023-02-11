package kenchang8787.com;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Podcast implements IObserverable {

  /** 廣播名稱 */
  private final String name;

  /** 訂閱用戶們 */
  private final List<IObserver> subscribers = new LinkedList<>();

  public Podcast(String name) {
    this.name = name;
  }

  /** 新增觀察者 (訂閱用戶) */
  @Override
  public void add(IObserver observer) {
    subscribers.add(observer);
  }

  /** 移除觀察者 (取消訂閱用戶) */
  @Override
  public void remove(IObserver observer) {
    subscribers.remove(observer);
  }

  /** 通知觀察者 (通知訂閱用戶) */
  @Override
  public void nofityObserver(String notifyText) {
    for (IObserver o : subscribers) o.update("[" + name + "] " + notifyText);
  }
}
