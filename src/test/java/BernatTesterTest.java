import junit.framework.TestCase;

public class BernatTesterTest extends TestCase {

  public void testDoStuff() {
    BernatTester bernatTester = new BernatTester();
    assert bernatTester.doStuff();

  }

  public void testDoSum() {
    BernatTester bernatTester = new BernatTester();

    int result = bernatTester.doSum(-1,-1);

    assertEquals(-2,result);
  }
}