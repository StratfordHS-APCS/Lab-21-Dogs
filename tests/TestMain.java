import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {
  @Test
  public void testSumCorner() {
    assertEquals("Corner location did not sum correctly.", Main.sumAround(4, 4), 12);
    assertEquals("Corner location did not sum correctly.", Main.sumAround(0, 4), 18);
  }

  @Test
  public void testSumInterior() {
    assertEquals("Interior (non-edge) locations did not sum correctly.", Main.sumAround(1, 2), 43);
    assertEquals("Interior (non-edge) locations did not sum correctly.", Main.sumAround(3, 3), 31);
  }

  @Test
  public void testSumEdge() {
    assertEquals("Edge location (non-interior, non-corner) did not sum correctly.", Main.sumAround(2, 0), 39);
    assertEquals("Edge location (non-interior, non-corner) did not sum correctly.", Main.sumAround(4, 2), 33);
  }
}