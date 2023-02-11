package kenchang8787.com;

/** 被觀察者 (廣播電台) */
public interface IObserverable {

  /** 新增觀察者 (訂閱用戶) */
  void add(IObserver observer);

  /** 移除觀察者 (取消訂閱用戶) */
  void remove(IObserver observer);

  /** 通知觀察者 (通知訂閱用戶) */
  void nofityObserver(String notifyText);
}
