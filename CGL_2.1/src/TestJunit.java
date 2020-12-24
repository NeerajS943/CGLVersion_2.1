import org.junit.jupiter.api.Assertions;
import org.junit.Test;
public class TestJunit {
	@Test
	public void createBoardTest() {
		Board a = new Board(4,3,false);
		int x[][] = {{0,2},{1,2},{2,1}};
		a.createBoard(x);
		String s = a.printBoard(board);
		System.out.println("======TestCase One Passed======");
		Assertions.assertSame(s,"..*.\n..*.\n.*..");
	}
	@Test
	public void nextGenerationTest() {
		ConwaysGameOfLife c = new ConwaysGameOfLife();
		c.generateNextGeneration();
		System.out.println("======TestCase Two Passed======");
		Assertions.assertSame("Next Generation Board is Created",c.generateNextGeneration());
	}

}
