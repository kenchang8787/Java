import kenchang8787.com.Student;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {

  @Test
  public void full_name() {
    Student student = new Student("Ken", "Chang");

    String name = student.getFullName();

    assertEquals("Ken Chang", name);
  }
}
