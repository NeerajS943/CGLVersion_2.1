import org.junit.jupiter.api.Assertions;
import org.junit.Test;
public class TestJunit {
	@Test
	public void testOne() {
		Board a = new Board();
		a.printBoard(false);
		a.createBoard(5);
		System.out.println("======TestCase One Passed======");
		Assertions.assertSame("Created Conway Board",a.createBoard(5));
	}
	@Test
	public void testTwo() {
		ConwaysGameOfLife c = new ConwaysGameOfLife();
		c.generateNextGeneration();
		System.out.println("======TestCase Two Passed======");
		Assertions.assertSame("Next Generation Board is Created",c.generateNextGeneration());
	}

}
