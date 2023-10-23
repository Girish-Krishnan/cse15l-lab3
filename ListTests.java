import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests { 
  @Test
  public void testFilter () {
    List<String> input1 = new ArrayList<>();
    input1.add("a");
    input1.add("b");

    List<String> expected1 = new ArrayList<>();
    expected1.add("a");
    expected1.add("b");

    assertEquals(expected1, ListExamples.filter(input1, new StringChecker() {
      public boolean checkString(String s) {
        return true;
      }
    }));
  }

}
