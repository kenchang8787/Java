package kenchang8787.com;

public class Main {
  public static void main(String[] args) {

    User student = new User("學生A");
    User teacher = new User("老師B");
    User nurse = new User("護士C");

    Podcast chinese = new Podcast("中文廣播");
    chinese.add(student);
    chinese.add(teacher);
    chinese.add(nurse);

    Podcast english = new Podcast("英文廣播");
    english.add(teacher);
    english.add(student);

    // 中文廣播更新了節目
    chinese.nofityObserver("本周更新了一檔新節目: 他的閨女的閨女都已經有了閨女");

    // 應文廣播更新了節目
    english.nofityObserver("TedTalk will having new show in this Sunday!");

    // 學生退訂
    english.remove(student);
    english.nofityObserver(
        "TedTalk are providing fully Java tutorial, please go to our website to learn together!");
  }
}
